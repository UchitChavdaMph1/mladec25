class Employee {
    id: number;
    name: string;
    city: string;

    constructor(id: number, name: string, city: string) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    
    getDetails(): string {
        return `ID: ${this.id}, Name: ${this.name}, City: ${this.city}`;
    }

    public disp(): void {
        console.log("Employee Details : ID: " + this.id + " Name: " + this.name + " City: " + this.city);
    }
}



let emp = new Employee(1, 'John Doe', 'New York');

console.log(emp.getDetails());
emp.disp();