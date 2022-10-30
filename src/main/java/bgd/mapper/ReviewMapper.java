package bgd.mapper;


import bgd.dto.ReviewDTO;
import bgd.domain.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper extends AbstractMapper<Review, ReviewDTO>{
    @Override
    public ReviewDTO mapObjectToDto(Review review) {
        if (review == null) return null;

        ReviewDTO.ReviewDTOBuilder reviewDtoBuilder = ReviewDTO.builder();
        reviewDtoBuilder.id(review.getId());
        reviewDtoBuilder.comment(review.getComment());
        reviewDtoBuilder.itemID(review.getItemID());
        reviewDtoBuilder.userID(review.getUserID());


        return reviewDtoBuilder.build();
    }
}