import React from 'react'
import StaffImage from './../assets/images/staff.jpg'
const About = () => {
  return (
    <div>
        <div className="row justify-content-evenly p-5 pt-2">
            <h3 className='text-center p-4'>About Us</h3>
            <div className="col-md-5">
                <img src={StaffImage} className="img-fluid" alt="..."></img>
            </div>
            <div className="col-md-5">
                <p style={{textAlign:'justify'}}>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam cupiditate, nostrum ipsa laborum nobis illo, voluptatibus optio quam laudantium sint praesentium, inventore omnis? Eaque ut sequi maiores hic debitis ducimus! Dolore debitis cum delectus quibusdam, rem magni culpa explicabo ea accusamus labore incidunt sunt aut repudiandae laboriosam totam provident doloremque inventore eos quas ut maxime reiciendis esse mollitia sed. Voluptatem! Consectetur at, veritatis veniam rerum delectus esse a debitis explicabo, sequi repudiandae laudantium maiores cupiditate! Quis sapiente eaque, nobis id porro nulla. Maxime eum praesentium quasi reprehenderit aut, repudiandae commodi.</p>
                <button type="button" class="btn btn-outline-danger">Explore Now</button>
            </div>
        </div>
    </div>
  )
}

export default About