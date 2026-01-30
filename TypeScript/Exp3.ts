interface Student {
    id: number;
    name: string;
    college: string;
    city?: string;
}

const student1 : Student = {
    id: 1,
    name: 'Rohit',
    college: 'ABC College',
    city: 'Mumbai'
};

const student2 : Student = {
    id: 2,
    name: 'Kohli',
    college: 'XYZ College',
    city: 'Punjab'
};

console.log(`Student 1: ID: ${student1.id}, Name: ${student1.name}, College: ${student1.college}, City: ${student1.city}`);
console.log(`Student 2: ID: ${student2.id}, Name: ${student2.name}, College: ${student2.college}, City: ${student2.city}`);
