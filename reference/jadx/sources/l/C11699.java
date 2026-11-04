package l;

import android.media.session.MediaSessionManager;

/* JADX INFO: renamed from: l.ۧܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J219 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11699 extends C25126 {
    public C11699(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29371(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
