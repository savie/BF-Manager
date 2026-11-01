package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import l.C22432;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        float containerHeight;
        int i;
        int i2;
        C22432 c22432 = (C22432) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i = ((ViewGroup.MarginLayoutParams) c22432).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c22432).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i = ((ViewGroup.MarginLayoutParams) c22432).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c22432).bottomMargin;
        }
        float f = i + i2;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(containerHeight + f, containerHeight), 1, containerHeight));
    }
}
