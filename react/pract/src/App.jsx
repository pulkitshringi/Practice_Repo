// App.jsx
import HomePage from "./pages/HomePage";
import AboutPage from "./pages/AboutPage";
import Profiles from "./pages/Profiles";
import ProfileId from "./pages/ProfileId";
import {createBrowserRouter,RouterProvider} from 'react-router-dom';

function App() {

  const router = createBrowserRouter([
    {
      path: "/",
      element: <HomePage />,
      errorElement: <h1>not found baba</h1>
    },
    {
      path: "/about",
      element: <AboutPage />
    },
    {
      path:"/profiles",
      element: <Profiles/>,
      children:[{
        path:"/profiles/:id",
        element: <ProfileId/>
      }]
    }
  ]);

  return (
    <>
      <div>
       <RouterProvider router={router}/>
      </div>
    </>
  )
}

export default App
