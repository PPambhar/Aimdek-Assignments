using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using EmployeeToDo.Services;
using EmployeeToDo.Views;

namespace EmployeeToDo
{
    public partial class App : Application
    {

        public App()
        {
            InitializeComponent();

            DependencyService.Register<MockDataStore>();
            MainPage = new Page1();
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
