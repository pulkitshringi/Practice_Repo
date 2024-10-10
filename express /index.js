const mongoose = require('mongoose');

async function connect() {
  try {
    await mongoose.connect('mongodb://localhost:27017/octTest');
    console.log('Connected');
  } catch (err) {
    console.log('Error:', err);
  }
}

connect();
let StudentSchema = new mongoose.Schema({
    name: String,
    age: Number,
    email: String,
    phone: Number
});
let Student = mongoose.model('Student', StudentSchema);
const user1 = new Student({name: 'John', age: 20, email: 'ese@gmail.com'});
user1.save().then(() => console.log('User created')).catch(err => console.log(err));