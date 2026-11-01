package com.google.android.material.transition;

import l.AbstractC11766;
import l.InterfaceC24031;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionListenerAdapter implements InterfaceC24031 {
    @Override // l.InterfaceC24031
    public void onTransitionCancel(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public void onTransitionEnd(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public void onTransitionPause(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public void onTransitionResume(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public void onTransitionStart(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
        onTransitionStart(abstractC11766);
    }

    @Override // l.InterfaceC24031
    public void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
        onTransitionEnd(abstractC11766);
    }
}
