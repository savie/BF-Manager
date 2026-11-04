package l;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܰ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14960 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Boolean f48866;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC20928 f48867;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC16956 f48868;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f48870;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile int f48869 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f48871 = Integer.MIN_VALUE;

    public C14960() {
        if (f48866 == null) {
            if (!C21576.m49084().bindService(new Intent(C21576.m49084(), (Class<?>) ServiceC24416.class), new ServiceConnectionC6758(), 1)) {
                f48866 = Boolean.FALSE;
            }
        }
        Application applicationM49084 = C21576.m49084();
        Intent intent = new Intent(applicationM49084, (Class<?>) ServiceC2041.class);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ServiceConnectionC24658 serviceConnectionC24658 = new ServiceConnectionC24658(this);
        if (applicationM49084.bindService(intent, serviceConnectionC24658, 1)) {
            this.f48867 = new RunnableC20928(this, atomicBoolean, applicationM49084, serviceConnectionC24658, 0);
        } else {
            this.f48867 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36004(C14960 c14960, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        if (atomicBoolean.compareAndSet(false, true)) {
            c14960.f48868 = null;
            try {
                application.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36011(String str, boolean z, boolean z2) {
        if (this.f48868 == null || f48866 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 2000;
            while (true) {
                if (this.f48868 != null && f48866 != null) {
                    break;
                } else if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    throw new Exception("Connection timeout");
                }
            }
        }
        if (str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        this.f48869 = Integer.MIN_VALUE;
        this.f48870 = false;
        boolean zMo29468 = this.f48868.mo29468(str, z, f48866.booleanValue(), z2);
        int i = this.f48871;
        if (this.f48868 != null) {
            try {
                this.f48869 = this.f48868.mo29471();
                this.f48871 = this.f48869;
                this.f48870 = true;
                C8398.m22559(this.f48869);
            } catch (Exception unused) {
                if (i != Integer.MIN_VALUE) {
                    C8398.m22559(i);
                }
            }
        } else if (i != Integer.MIN_VALUE) {
            C8398.m22559(i);
        }
        if (zMo29468) {
            return;
        }
        m36006();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36010() {
        if (this.f48868 != null) {
            try {
                this.f48868.exit();
            } catch (Throwable unused) {
            }
        }
        this.f48868 = null;
        RunnableC20928 runnableC20928 = this.f48867;
        if (runnableC20928 == null) {
            return;
        }
        try {
            runnableC20928.run();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m36019(byte[] bArr) {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo29481 = this.f48868.mo29481(bArr);
        if (strMo29481 == null) {
            m36006();
        }
        return strMo29481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36009(byte[] bArr) throws C21674 {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo29476 = this.f48868.mo29476(bArr);
        if (strMo29476 == null) {
            m36006();
        }
        return Integer.parseInt(strMo29476);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36012(String str, String str2) throws C21674 {
        C6178 c6178 = new C6178();
        c6178.m17786((CharSequence) str);
        c6178.m17786((CharSequence) str2);
        c6178.writeByte(0);
        byte[] bArrM17796 = c6178.m17796();
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        byte[] bArrMo29480 = this.f48868.mo29480(bArrM17796);
        if (bArrMo29480 == null) {
            m36006();
        }
        return bArrMo29480;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short[] m36021(String str, String str2) throws C21674 {
        C6178 c6178 = new C6178();
        c6178.m17786((CharSequence) str);
        c6178.m17786((CharSequence) str2);
        c6178.writeByte(0);
        byte[] bArrM17796 = c6178.m17796();
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo29478 = this.f48868.mo29478(bArrM17796);
        if (iArrMo29478 == null) {
            m36006();
            return null;
        }
        int length = iArrMo29478.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) iArrMo29478[i];
        }
        return sArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char[] m36020(String str, String str2) throws C21674 {
        C6178 c6178 = new C6178();
        c6178.m17786((CharSequence) str);
        c6178.m17786((CharSequence) str2);
        c6178.writeByte(0);
        byte[] bArrM17796 = c6178.m17796();
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo29473 = this.f48868.mo29473(bArrM17796);
        if (iArrMo29473 == null) {
            m36006();
            return null;
        }
        int length = iArrMo29473.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArrMo29473[i];
        }
        return cArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] m36014(String str, String str2) throws C21674 {
        C6178 c6178 = new C6178();
        c6178.m17786((CharSequence) str);
        c6178.m17786((CharSequence) str2);
        c6178.writeByte(0);
        byte[] bArrM17796 = c6178.m17796();
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo29470 = this.f48868.mo29470(bArrM17796);
        if (iArrMo29470 != null) {
            return iArrMo29470;
        }
        m36006();
        return null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m36016(String str, String str2) throws C21674 {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int iMo29479 = this.f48868.mo29479(str, str2);
        if (iMo29479 == -1) {
            m36006();
        }
        return iMo29479;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m36015(String str, String str2) throws C21674 {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo29475 = this.f48868.mo29475(str, str2);
        if (strMo29475 == null) {
            m36006();
        }
        return strMo29475;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m36008(String str, String str2) throws C21674 {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo29469 = this.f48868.mo29469(str, str2);
        if (iArrMo29469 == null) {
            m36006();
        }
        return iArrMo29469;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] m36017(String str, String str2) throws C21674 {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo29482 = this.f48868.mo29482(str, str2);
        if (iArrMo29482 == null) {
            m36006();
        }
        return iArrMo29482;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] m36013(String str, String str2) throws C21674 {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo29472 = this.f48868.mo29472(str, str2);
        if (iArrMo29472 == null) {
            m36006();
        }
        return iArrMo29472;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36018(String str, String str2) {
        if (this.f48868 == null) {
            throw new RuntimeException("Disconnected");
        }
        this.f48868.mo29477(str, str2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m36006() throws C21674 {
        if (this.f48868 == null) {
            throw new C21674("Disconnected after load failure");
        }
        try {
            String[] strArrMo29474 = this.f48868.mo29474();
            if (strArrMo29474 != null) {
                String strM49088 = strArrMo29474[0];
                int i = !this.f48870 ? Integer.MIN_VALUE : this.f48869;
                if (i != Integer.MIN_VALUE && i <= -1000) {
                    strM49088 = C21576.m49088(R.string.MT_Protector);
                } else if (strM49088 != null && strM49088.startsWith("Seccomp fatal:")) {
                    strM49088 = C21576.m49088(R.string.MT_Protector);
                }
                throw new C4520(strM49088, strArrMo29474);
            }
        } catch (RemoteException unused) {
            throw new C21674("Disconnected after load failure");
        }
    }
}
