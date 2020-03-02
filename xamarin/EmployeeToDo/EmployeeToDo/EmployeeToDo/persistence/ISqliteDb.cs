using System;
using System.Collections.Generic;
using System.Text;
using SQLite;

namespace EmployeeToDo.persistence
{
    public interface ISqliteDb
    {
        SQLiteAsyncConnection GetConnection();
    }
}
