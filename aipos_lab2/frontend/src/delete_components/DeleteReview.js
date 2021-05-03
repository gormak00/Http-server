import React, {Component} from "react";
import { Button } from '@material-ui/core';
import axios from 'axios';
import {Link, Redirect, withRouter} from "react-router-dom";
import * as PropTypes from "prop-types";

Redirect.propTypes = {to: PropTypes.string};

class DeleteReview extends Component{

    constructor(props) {
        super(props);
        this.state = {
            status: ''
        };
    }

    componentDidMount() {
        console.log(this.props);
        axios.delete('http://localhost:8082/reviews/delete/' + this.props.match.params.id)
            .then((response) => {
                this.setState({status: response.data.status});
            })
            .catch((error) => {
                console.log(error);
                this.setState({message: error.message})
            });
    }

    render() {
        if (this.state.status === 1) {
            return (
                <Redirect to={'/Review'}/>
            );
        }
        return (
            <div>Deletion complete
                <br/><Button component={Link} to="/Review" variant="contained" color="primary" >Review's Table</Button>
            </div>
        );
    }
}
export default withRouter(DeleteReview);
