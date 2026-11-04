package com.google.android.material.motion;

import l.C18584;

/* JADX INFO: loaded from: classes.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(C18584 c18584);

    void updateBackProgress(C18584 c18584);
}
