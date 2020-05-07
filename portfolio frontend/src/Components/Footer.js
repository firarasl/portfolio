import React, { Component } from 'react';

class Footer extends Component {
  render() {

    return (
      <footer>

     <div className="row">
        <div className="twelve columns">
           <ul className="social-links">
           <li>
               <a href="https://github.com/firarasl?tab=repositories" target="_blank">
                  <i className="fa fa-github" data-toggle="tooltip" data-placement="top" title="My Github">
                     </i>
                     </a>
                     </li>
                      <li>
               <a href="https://www.linkedin.com/in/firangiz-rasulova-221a30194/" target="_blank">
                  <i className="fa fa-linkedin" data-toggle="tooltip" data-placement="top" title="My Linkedin">
                     </i>
                     </a>
                     </li>
            <li>
               <a href="https://gitlab.com/firangiz" target="_blank">
                  <i className="fa fa-github" data-toggle="tooltip" data-placement="top" title="My GitLab">
                     </i>
                     </a>
                     </li>
           </ul>

           <ul className="copyright">
              <li>&copy; Copyright {(new Date().getFullYear())} Firangiz Rasulova</li>
           </ul>

        </div>
        <div id="go-top"><a className="smoothscroll" title="Back to Top" href="#home"><i className="icon-up-open"></i></a></div>
     </div>
  </footer>
    );
  }
}

export default Footer;
