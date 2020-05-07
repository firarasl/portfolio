import React, { Component } from 'react';
class CV extends Component {

    render() {
        return(
            <section id="cv">
            <div className="row">
               <div className="three columns">
               </div>
               <div className="nine columns main-col">
      
                  <div className="row">
                     <div className="columns download">
                         <h2 className="centered-button">You may download my Cv right here!</h2>
                        <p className="centered-button">
                           <a href="http://localhost:8080/pdf-cv" className="button"><i className="fa fa-download"></i>Download Resume</a>
                        </p>
                     </div>
                  </div>
               </div>
            </div>
      
         </section>
      
         );
    }
}
export default CV;
