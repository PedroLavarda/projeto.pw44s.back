package br.edu.projeto.server.controller;

import br.edu.projeto.server.dto.ReviewDTO;
import br.edu.projeto.server.model.Review;
import br.edu.projeto.server.service.ICrudService;
import br.edu.projeto.server.service.IReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reviews")
public class ReviewController extends CrudController<Review, ReviewDTO, Long> {
    private final IReviewService reviewService;
    private final ModelMapper modelMapper;

    public ReviewController(IReviewService reviewService, ModelMapper modelMapper) {
        super(Review.class, ReviewDTO.class);
        this.reviewService = reviewService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<Review, Long> getService() {
        return reviewService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
