var Employee = /** @class */ (function () {
    function Employee(id, name, city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    Employee.prototype.getDetails = function () {
        return "ID: ".concat(this.id, ", Name: ").concat(this.name, ", City: ").concat(this.city);
    };
    Employee.prototype.disp = function () {
        console.log("Employee Details : ID: " + this.id + " Name: " + this.name + " City: " + this.city);
    };
    return Employee;
}());
var emp = new Employee(1, 'John Doe', 'New York');
console.log(emp.getDetails());
emp.disp();
