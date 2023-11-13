package com.thesis.orderservice.service;

import com.netflix.discovery.converters.Auto;
import com.thesis.orderservice.dto.PromotionDTO;
import com.thesis.orderservice.entity.Promotion;
import com.thesis.orderservice.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;

    public long addPromotion(PromotionDTO promotionDTO){
        Promotion promotion = new Promotion();
        promotion.setDescription(promotionDTO.getDescription());
        promotion.setCouponCode(promotionDTO.getCouponCode());
        promotion.setCouponPercent(promotionDTO.getCouponPercent());
        promotion.setStartDate(promotionDTO.getStartDate());
        promotion.setEndDate(promotionDTO.getEndDate());
        promotionRepository.save(promotion);
        return promotion.getPromotionId();
    }
    public float validCouponCode(String couponCode) {
        Promotion promotion = promotionRepository.findPromotionByCouponCode(couponCode);

        if (promotion != null) {
            return promotion.getCouponPercent();
        } else {
            // Trả về giá trị mặc định hoặc xử lý khi mã giảm giá không hợp lệ
            return 0.0f; // hoặc throw một Exception, tùy thuộc vào logic ứng dụng của bạn
        }
    }

}
