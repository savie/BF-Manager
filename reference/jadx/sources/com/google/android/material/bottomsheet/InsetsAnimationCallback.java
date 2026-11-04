package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;
import l.AbstractC7749;
import l.C0291;
import l.C22623;
import l.C3977;

/* JADX INFO: loaded from: classes.dex */
public class InsetsAnimationCallback extends AbstractC7749 {
    public int startTranslationY;
    public int startY;
    public final int[] tmpLocation;
    public final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // l.AbstractC7749
    public void onPrepare(C22623 c22623) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // l.AbstractC7749
    public C0291 onStart(C22623 c22623, C0291 c0291) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return c0291;
    }

    @Override // l.AbstractC7749
    public C3977 onProgress(C3977 c3977, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22623 c22623 = (C22623) it.next();
            if ((c22623.m50972() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, c22623.m50973()));
                break;
            }
        }
        return c3977;
    }

    @Override // l.AbstractC7749
    public void onEnd(C22623 c22623) {
        this.view.setTranslationY(0.0f);
    }
}
