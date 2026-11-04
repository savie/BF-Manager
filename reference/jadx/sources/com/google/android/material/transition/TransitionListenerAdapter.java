package com.google.android.material.transition;

import l.AbstractC0329;
import l.InterfaceC12261;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionListenerAdapter implements InterfaceC12261 {
    @Override // l.InterfaceC12261
    public void onTransitionCancel(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public void onTransitionEnd(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public void onTransitionPause(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public void onTransitionResume(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public void onTransitionStart(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
        onTransitionStart(abstractC0329);
    }

    @Override // l.InterfaceC12261
    public void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
        onTransitionEnd(abstractC0329);
    }
}
