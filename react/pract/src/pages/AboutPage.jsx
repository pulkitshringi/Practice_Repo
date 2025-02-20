// AboutPage.jsx
import React from 'react'
import {Link} from 'react-router-dom';

const AboutPage = () => {
  return (
    <div>
        <h1>This is About Page</h1>
        <Link to="/">Go to Home from Link</Link>
         <br/>
        <a href="/">Go to Home from anchor</a>
        </div>
  )
}

export default AboutPage