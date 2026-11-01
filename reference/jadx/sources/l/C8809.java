package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8809 extends AbstractC9677 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f30294;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f30295;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f30296;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f30297;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19392 f30298;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f30299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14413 f30300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f30301;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f30302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f30303;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1752 f30304;

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "payload";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C1752 m22932(boolean z) {
        if (m22936() && (z || this.f30294 == null)) {
            C1752 c1752 = new C1752();
            this.f30304 = c1752;
            return c1752;
        }
        return null;
    }

    public C8809(AbstractC20745 abstractC20745, long j, long j2) {
        this.f30301 = abstractC20745;
        this.f30296 = j;
        this.f30302 = j2;
        this.f30295 = null;
        this.f30297 = null;
        this.f30303 = 0;
        this.f30300 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8809 m22927(int i, String str, String str2) {
        return new C8809(str, str2, i, null);
    }

    public C8809(String str, String str2, int i, C14413 c14413) {
        this.f30301 = null;
        this.f30296 = 0L;
        this.f30302 = 0L;
        this.f30295 = str;
        C13638.requireNonNull(str2);
        this.f30297 = str2;
        this.f30303 = i;
        this.f30300 = c14413;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
        if (m22936()) {
            C14413 c14413 = this.f30300;
            String strM34679 = c14413 == null ? null : c14413.m34679();
            boolean z = strM34679 != null;
            c11018.m27786(!z ? "\u0001MT_REMOTE_PAYLOAD_SOURCE_V1" : "\u0001MT_REMOTE_PAYLOAD_SOURCE_V2");
            c11018.m27782((CharSequence) this.f30295);
            c11018.m27782((CharSequence) this.f30297);
            c11018.writeInt(this.f30303);
            if (z) {
                c11018.m27791(c14413.m34682());
                c11018.m27792(c14413.m34680());
                c11018.m27792(c14413.m34683());
                c11018.m27782((CharSequence) strM34679);
                return;
            }
            return;
        }
        c11018.m27786(this.f30301.mo33986());
        c11018.m27791(this.f30296);
        c11018.m27791(this.f30302);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8809 m22928(C17367 c17367) {
        String strM40458 = c17367.m40458();
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V1".equals(strM40458)) {
            return m22927(c17367.readInt(), c17367.m40442(), c17367.m40442());
        }
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V2".equals(strM40458)) {
            return new C8809(c17367.m40442(), c17367.m40442(), c17367.readInt(), new C14413(c17367.readLong(), c17367.m40457(), c17367.m40457(), c17367.m40442()));
        }
        return new C8809(C5553.m15313(strM40458, new String[0]), c17367.readLong(), c17367.readLong());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22933(C1752 c1752) {
        InterfaceC19392 interfaceC19392 = this.f30298;
        if (interfaceC19392 != null) {
            C19431.m44468(interfaceC19392);
            this.f30298 = null;
        }
        InterfaceC19392 interfaceC19392M22929 = m22929(c1752);
        this.f30298 = interfaceC19392M22929;
        this.f30294 = interfaceC19392M22929.mo34856();
        InterfaceC19392 interfaceC19393 = this.f30298;
        if (interfaceC19393 instanceof C14454) {
            this.f30300 = ((C14454) interfaceC19393).m34859();
            return;
        }
        AbstractC20745 abstractC20745 = this.f30301;
        if (abstractC20745 != null) {
            this.f30299 = abstractC20745.mo33991();
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        C1752 c1752;
        synchronized (this) {
            c1752 = this.f30304;
            this.f30304 = null;
        }
        m22933(c1752);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) {
        if (this.f30298 == null) {
            mo10267(false);
        }
        return this.f30298.mo34858(((C8103) interfaceC2557).m21321());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        if (this.f30294 == null) {
            mo10267(false);
        }
        String strSubstring = str.substring(1);
        for (C9474 c9474 : this.f30294) {
            if (c9474.m24284().equals(strSubstring)) {
                return new C8103(c9474);
            }
        }
        return null;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("payload".getBytes());
        C22253.m49418(messageDigest, m22934());
        if (m22936()) {
            C22253.m49418(messageDigest, this.f30297);
        } else {
            messageDigest.update(String.valueOf(this.f30299).getBytes());
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        if (this.f30294 == null) {
            mo10267(false);
        }
        ArrayList arrayList = new ArrayList(this.f30294.size() + 1);
        if ("/".equals(str)) {
            Iterator it = this.f30294.iterator();
            while (it.hasNext()) {
                arrayList.add(new C8103((C9474) it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19392 m22929(C1752 c1752) throws IOException {
        if (!m22936()) {
            long j = this.f30302;
            C1388 c1388M46710 = this.f30301.m46710("r");
            long j2 = this.f30296;
            if (j2 > 0) {
                try {
                    c1388M46710 = c1388M46710.m4865(j2, j);
                } catch (IOException e) {
                    c1388M46710.close();
                    throw e;
                }
            }
            return new C18686(c1388M46710);
        }
        return C14454.m34853(this.f30295, this.f30297, this.f30303, this.f30300, c1752);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m22931() {
        return this.f30301;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m22930() {
        AbstractC20745 abstractC20745 = this.f30301;
        return (abstractC20745 == null || this.f30299 == abstractC20745.mo33991()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m22935() {
        AbstractC20745 abstractC20745 = this.f30301;
        return abstractC20745 == null || abstractC20745.mo33975();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m22936() {
        return this.f30295 != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m22934() {
        return m22936() ? this.f30295 : this.f30301.mo33986();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m22937() {
        if (m22936()) {
            StringBuilder sb = new StringBuilder("remote\nurlLength=");
            String str = this.f30295;
            sb.append(str.length());
            sb.append("\n");
            sb.append(str);
            return sb.toString();
        }
        String strMo33986 = this.f30301.mo33986();
        int i = C20098.f65279;
        return "pathLength=" + strMo33986.length() + "\n" + strMo33986 + "\noffset=" + this.f30296 + "\nlength=" + this.f30302;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC19392 interfaceC19392 = this.f30298;
        if (interfaceC19392 != null) {
            C19431.m44468(interfaceC19392);
            this.f30298 = null;
        }
    }
}
