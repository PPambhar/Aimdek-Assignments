using SQLite;
using SQLitePCL;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using EmployeeToDo.persistence;

namespace EmployeeToDo.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Page1 : ContentPage
    {
        public Page1()
        {
            InitializeComponent();
            _connection = DependencyService.Get<ISqliteDb>().GetConnection();
        }
        private SQLiteAsyncConnection _connection;
        private ObservableCollection<test> _test;

        protected async override void OnAppearing()
        {
            await _connection.CreateTableAsync<test>();
            var abc = await _connection.Table<test>().ToListAsync();
            _test = new ObservableCollection<test>(abc);
            mylistview.ItemsSource = _test;

            base.OnAppearing();
        }

        void OnAdd(object sender, System.EventArgs e)
        {
            var test = new test { Title = Title.Text, Desc = Description.Text };
            _connection.InsertAsync(test);
            _test.Add(test);

        }

        void OnDelete(object sender, System.EventArgs e)
        {
            var del = _test[0];
            _connection.DeleteAsync(del);
            _test.Remove(del);

        }

        void OnUpdate(object sender, System.EventArgs e)
        {
            var update = _test[0];
            update.Title += "Updated";
            _connection.UpdateAsync(update);
            OnAppearing();

        }



    }
    public class test
    {
        [PrimaryKey, AutoIncrement]
        public int id { get; set; }

        [MaxLength(255)]
        public string Title { get; set; }

        [MaxLength(1000)]
        public string Desc { get; set; }
    }

}