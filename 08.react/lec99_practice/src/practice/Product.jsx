import React from 'react';
import { useParams } from 'react-router-dom';

const Product = () => {
  // useParams() : 파라미터 정보를 가져옴
  const {productId} = useParams();
  return (
    <div>
      <h3>{productId}번상품 페이지입니다</h3>
    </div>
  );
};

export default Product;