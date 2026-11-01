package l;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܽ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16944 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Boolean f54164;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC7772 f54166;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC18831 f54168;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f54169;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile int f54167 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile int f54165 = Integer.MIN_VALUE;

    public C16944() {
        if (f54164 == null) {
            if (!C16737.m39277().bindService(new Intent(C16737.m39277(), (Class<?>) ServiceC20243.class), new ServiceConnectionC16239(), 1)) {
                f54164 = Boolean.FALSE;
            }
        }
        Application applicationM39277 = C16737.m39277();
        Intent intent = new Intent(applicationM39277, (Class<?>) ServiceC15304.class);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ServiceConnectionC20472 serviceConnectionC20472 = new ServiceConnectionC20472(this);
        if (applicationM39277.bindService(intent, serviceConnectionC20472, 1)) {
            this.f54166 = new RunnableC7772(this, atomicBoolean, applicationM39277, serviceConnectionC20472);
        } else {
            this.f54166 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39675(C16944 c16944, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        if (atomicBoolean.compareAndSet(false, true)) {
            c16944.f54168 = null;
            try {
                application.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39684(String str, boolean z, boolean z2) throws Exception {
        if (this.f54168 == null || f54164 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 2000;
            while (true) {
                if (this.f54168 != null && f54164 != null) {
                    break;
                } else if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    throw new Exception("Connection timeout");
                }
            }
        }
        if (str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        this.f54167 = Integer.MIN_VALUE;
        this.f54169 = false;
        boolean zMo32596 = this.f54168.mo32596(str, z, f54164.booleanValue(), z2);
        int i = this.f54165;
        if (this.f54168 != null) {
            try {
                this.f54167 = this.f54168.mo32602();
                this.f54165 = this.f54167;
                this.f54169 = true;
                C10336.m26218(this.f54167);
            } catch (Exception unused) {
                if (i != Integer.MIN_VALUE) {
                    C10336.m26218(i);
                }
            }
        } else if (i != Integer.MIN_VALUE) {
            C10336.m26218(i);
        }
        if (zMo32596) {
            return;
        }
        m39677();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39683() {
        if (this.f54168 != null) {
            try {
                this.f54168.exit();
            } catch (Throwable unused) {
            }
        }
        this.f54168 = null;
        RunnableC7772 runnableC7772 = this.f54166;
        if (runnableC7772 == null) {
            return;
        }
        try {
            runnableC7772.run();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m39690(byte[] bArr) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo32594 = this.f54168.mo32594(bArr);
        if (strMo32594 == null) {
            m39677();
        }
        return strMo32594;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39682(byte[] bArr) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo32608 = this.f54168.mo32608(bArr);
        if (strMo32608 == null) {
            m39677();
        }
        return Integer.parseInt(strMo32608);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m39685(String str, String str2) throws C12711 {
        C11018 c11018 = new C11018();
        c11018.m27782((CharSequence) str);
        c11018.m27782((CharSequence) str2);
        c11018.writeByte(0);
        byte[] bArrM27773 = c11018.m27773();
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        byte[] bArrMo32606 = this.f54168.mo32606(bArrM27773);
        if (bArrMo32606 == null) {
            m39677();
        }
        return bArrMo32606;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short[] m39680(String str, String str2) throws C12711 {
        C11018 c11018 = new C11018();
        c11018.m27782((CharSequence) str);
        c11018.m27782((CharSequence) str2);
        c11018.writeByte(0);
        byte[] bArrM27773 = c11018.m27773();
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo32600 = this.f54168.mo32600(bArrM27773);
        if (iArrMo32600 == null) {
            m39677();
            return null;
        }
        int length = iArrMo32600.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) iArrMo32600[i];
        }
        return sArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] m39691(String str, String str2) throws C12711 {
        C11018 c11018 = new C11018();
        c11018.m27782((CharSequence) str);
        c11018.m27782((CharSequence) str2);
        c11018.writeByte(0);
        byte[] bArrM27773 = c11018.m27773();
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo32604 = this.f54168.mo32604(bArrM27773);
        if (iArrMo32604 == null) {
            m39677();
            return null;
        }
        int length = iArrMo32604.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArrMo32604[i];
        }
        return cArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] m39688(String str, String str2) throws C12711 {
        C11018 c11018 = new C11018();
        c11018.m27782((CharSequence) str);
        c11018.m27782((CharSequence) str2);
        c11018.writeByte(0);
        byte[] bArrM27773 = c11018.m27773();
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo32598 = this.f54168.mo32598(bArrM27773);
        if (iArrMo32598 != null) {
            return iArrMo32598;
        }
        m39677();
        return null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m39679(String str, String str2) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int iMo32605 = this.f54168.mo32605(str, str2);
        if (iMo32605 == -1) {
            m39677();
        }
        return iMo32605;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m39687(String str, String str2) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo32607 = this.f54168.mo32607(str, str2);
        if (strMo32607 == null) {
            m39677();
        }
        return strMo32607;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] m39681(String str, String str2) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo32597 = this.f54168.mo32597(str, str2);
        if (iArrMo32597 == null) {
            m39677();
        }
        return iArrMo32597;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] m39692(String str, String str2) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo32595 = this.f54168.mo32595(str, str2);
        if (iArrMo32595 == null) {
            m39677();
        }
        return iArrMo32595;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] m39689(String str, String str2) throws C12711 {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo32603 = this.f54168.mo32603(str, str2);
        if (iArrMo32603 == null) {
            m39677();
        }
        return iArrMo32603;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m39686(String str, String str2) {
        if (this.f54168 == null) {
            throw new RuntimeException("Disconnected");
        }
        this.f54168.mo32599(str, str2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m39677() throws C12711 {
        if (this.f54168 == null) {
            throw new C12711("Disconnected after load failure");
        }
        try {
            String[] strArrMo32601 = this.f54168.mo32601();
            if (strArrMo32601 != null) {
                String strM39288 = strArrMo32601[0];
                int i = !this.f54169 ? Integer.MIN_VALUE : this.f54167;
                if (i != Integer.MIN_VALUE && i <= -1000) {
                    strM39288 = C16737.m39288(R.string.MT_Protector);
                } else if (strM39288 != null && strM39288.startsWith("Seccomp fatal:")) {
                    strM39288 = C16737.m39288(R.string.MT_Protector);
                }
                throw new C0715(strM39288, strArrMo32601);
            }
        } catch (RemoteException unused) {
            throw new C12711("Disconnected after load failure");
        }
    }
}
