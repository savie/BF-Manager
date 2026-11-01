package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;
import l.AbstractC17026;
import l.C12088;
import l.C15844;
import l.C5259;

/* JADX INFO: loaded from: classes.dex */
public class InsetsAnimationCallback extends AbstractC17026 {
    public int startTranslationY;
    public int startY;
    public final int[] tmpLocation;
    public final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // l.AbstractC17026
    public void onPrepare(C5259 c5259) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // l.AbstractC17026
    public C12088 onStart(C5259 c5259, C12088 c12088) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return c12088;
    }

    @Override // l.AbstractC17026
    public C15844 onProgress(C15844 c15844, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5259 c5259 = (C5259) it.next();
            if ((c5259.m14531() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, c5259.m14532()));
                break;
            }
        }
        return c15844;
    }

    @Override // l.AbstractC17026
    public void onEnd(C5259 c5259) {
        this.view.setTranslationY(0.0f);
    }
}
