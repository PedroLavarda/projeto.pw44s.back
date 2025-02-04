package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Review;
import br.edu.projeto.server.repository.ReviewRepository;
import br.edu.projeto.server.service.IReviewService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl extends CrudServiceImpl<Review, Long> implements IReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    protected JpaRepository<Review, Long> getRepository() {
        return reviewRepository;
    }
}
