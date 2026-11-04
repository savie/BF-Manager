package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9R8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24067 extends ArrayList {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f77813 = new byte[8];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f77814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f77815;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f77816;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f77817;

    public C24067(String str) {
        this.f77815 = str;
    }

    public C24067(AbstractC22044 abstractC22044) throws IOException {
        this.f77817 = abstractC22044;
        m53621();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53618(AbstractC22044 abstractC22044) {
        if (this.f77817 != null) {
            throw new IllegalStateException();
        }
        this.f77817 = abstractC22044;
        m53614(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m53615() {
        m53614(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53614(boolean z) {
        C17359.requireNonNull(this.f77817);
        C6178 c6178 = new C6178();
        c6178.m17789(z);
        c6178.m17800(this.f77815);
        c6178.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C3929 c3929 = (C3929) it.next();
            c6178.writeInt(c3929.f13415);
            c6178.mo17812(c3929.f13417);
            c6178.m17786((CharSequence) c3929.f13418);
            c6178.m17804(c3929.f13419);
            c6178.m17786((CharSequence) c3929.f13416);
        }
        this.f77817.m49849(c6178.m17799());
        this.f77816 = this.f77817.mo4286();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m53621() throws IOException {
        C17359.requireNonNull(this.f77817);
        C20348 c20348M46740 = C20348.m46740(this.f77817.m49865());
        clear();
        this.f77814 = c20348M46740.m46753();
        String strM46758 = c20348M46740.m46758();
        String str = this.f77815;
        if (str == null) {
            this.f77815 = strM46758;
        } else if (!str.equals(strM46758)) {
            throw new IOException();
        }
        int i = c20348M46740.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            C3929 c3929 = new C3929();
            c3929.f13415 = c20348M46740.readInt();
            c3929.f13417 = c20348M46740.m46749();
            c3929.f13418 = c20348M46740.m46756();
            c3929.f13419 = c20348M46740.m46757();
            c3929.f13416 = c20348M46740.m46756();
            add(c3929);
        }
        this.f77816 = this.f77817.mo4286();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m53619() {
        long j = this.f77816;
        AbstractC22044 abstractC22044 = this.f77817;
        C17359.requireNonNull(abstractC22044);
        if (j != abstractC22044.mo4286()) {
            System.out.println("File changed: " + this.f77817.mo4294());
            m53621();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53617(MessageDigest messageDigest) {
        byte[] bArr = f77813;
        synchronized (bArr) {
            C6929.m19211(this.f77816, 0, bArr);
            messageDigest.update(bArr);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m53622() {
        return this.f77814;
    }

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m53616() {
        AbstractC22044 abstractC22044 = this.f77817;
        C17359.requireNonNull(abstractC22044);
        return abstractC22044;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m53620() {
        return this.f77815;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m53623() {
        if (this.f77815.equals("")) {
            return "[DEFAULT]";
        }
        String str = this.f77815;
        return str.charAt(0) == '-' ? str.substring(1) : str;
    }
}
