package com.google.android.material.motion;

import l.C0443;

/* JADX INFO: loaded from: classes.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(C0443 c0443);

    void updateBackProgress(C0443 c0443);
}
