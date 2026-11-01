package l;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: l.ۗۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3185 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11970;

    public /* synthetic */ RunnableC3185(int i, Object obj) {
        this.f11969 = i;
        this.f11970 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11969;
        Object obj = this.f11970;
        switch (i) {
            case 0:
                C6111.m16722((C6111) obj);
                break;
            case 1:
                ((C6938) obj).collapseActionView();
                break;
            case 2:
                C16777.m39346((Runnable) obj);
                break;
            case 3:
                ((C19186) obj).close();
                break;
            case 4:
                AbstractC21013.m47191((AbstractC21013) obj);
                break;
            case 5:
                ((MediaPlayer) obj).release();
                break;
            case 6:
                C1263 c1263 = (C1263) obj;
                int i2 = ActivityC10957.f37270;
                if (c1263 != null) {
                    c1263.close();
                }
                break;
            default:
                ActivityC10181.m25956((ActivityC10181) obj);
                break;
        }
    }
}
