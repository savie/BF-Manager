package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۠ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8289 extends AbstractC9677 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6037 f28782;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f28785;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f28786;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1044 f28787;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f28788;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f28789;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Charset f28790;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Map f28791;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28792;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f28784 = C8574.f29651;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f28793 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19805 f28783 = new C19805(1);

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "zip";
    }

    public C8289(String str) {
        this.f28786 = C5553.m15313(str, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8289 m21708(C17367 c17367) {
        C8289 c8289 = new C8289(c17367.m40458());
        c8289.f28784 = c17367.m40451();
        c8289.f28792 = c17367.m40461();
        c8289.f28789 = c17367.m40448();
        String strM40458 = c17367.m40458();
        if (!strM40458.isEmpty()) {
            c8289.m21713(strM40458);
        }
        String strM40459 = c17367.m40458();
        if (!strM40459.isEmpty()) {
            c8289.f28790 = Charset.forName(strM40459);
        }
        C18872 c18872 = (C18872) C12375.m30786(c17367.m40458());
        if (c18872 != null) {
            c8289.f28788 = c18872.f61109;
            c8289.f28791 = c18872.f61111;
            c8289.f28787 = c18872.f61108;
            c8289.f28785 = c18872.f61110;
        }
        return c8289;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        C2455 c2455 = new C2455(this.f28786, this.f28790);
        try {
            m21710(c2455);
            c2455.close();
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List m21716() {
        C2455 c2455M7446 = C2455.m7446(this.f28786, this.f28790);
        try {
            m21710(c2455M7446);
            List listUnmodifiableList = C0561.unmodifiableList(new ArrayList(c2455M7446.m7468()));
            c2455M7446.close();
            return listUnmodifiableList;
        } catch (Throwable th) {
            try {
                c2455M7446.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21710(C2455 c2455) {
        byte[] bArrM7486 = c2455.m7486();
        if (bArrM7486 == null) {
            bArrM7486 = C8574.f29651;
        }
        this.f28784 = bArrM7486;
        this.f28788 = C0561.unmodifiableList(c2455.m7489());
        this.f28791 = c2455.m7484();
        this.f28787 = new C1044(this.f28788);
        boolean zM7482 = c2455.m7482();
        this.f28792 = zM7482;
        this.f28789 = zM7482 ? C20240.m45746(c2455) : null;
        this.f28785 = this.f28786.mo33991();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m24614()) {
            return;
        }
        C19805 c19805 = this.f28783;
        c19805.close();
        while (true) {
            C2455 c2455 = (C2455) c19805.m45009();
            if (c2455 == null) {
                return;
            } else {
                C19431.m44468(c2455);
            }
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) {
        return m21714(abstractActivityC12483, interfaceC2557, new C14681());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: ᩳۢ᩺ -> 0x013a, TRY_LEAVE, TryCatch #2 {ᩳۢ᩺ -> 0x013a, blocks: (B:63:0x00fc, B:67:0x010d, B:69:0x011a, B:71:0x0120, B:73:0x0128, B:75:0x012e), top: B:87:0x00fc }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FilterInputStream m21714(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557, final InterfaceC5614 interfaceC5614) throws C17978 {
        boolean zM16304;
        boolean z;
        BufferedInputStream bufferedInputStream;
        C19805 c19805;
        boolean z2;
        if (!interfaceC5614.mo2357()) {
            C12107 c12107M15713 = ((C5696) interfaceC2557).m15713();
            boolean zM45041 = C19808.m45041(c12107M15713);
            C19805 c19806 = this.f28783;
            AbstractC20745 abstractC20745 = this.f28786;
            if (!zM45041) {
                Iterator itM27974 = null;
                while (!interfaceC5614.mo2357()) {
                    String strM21722 = m21722();
                    try {
                        if (c12107M15713.m30133() && (strM21722 == null || strM21722.isEmpty())) {
                            if (itM27974 == null) {
                                itM27974 = C11088.m27974();
                            }
                            if (itM27974.hasNext()) {
                                m21713((String) itM27974.next());
                                zM16304 = false;
                                z = true;
                            } else {
                                C6004 c6004 = new C6004(abstractActivityC12483, new C3078(1, this));
                                c6004.m16303(new BooleanSupplier() { // from class: l.᩸ܽ֨
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        return interfaceC5614.mo2357();
                                    }
                                });
                                zM16304 = c6004.m16304();
                                if (!zM16304) {
                                    break;
                                }
                            }
                            byte[] bArr = this.f28784;
                            String strM21723 = m21722();
                            if (m24614()) {
                                c19805 = c19806;
                            } else {
                                c19805 = null;
                            }
                            bufferedInputStream = new BufferedInputStream(C19808.m45033(c12107M15713, abstractC20745, bArr, strM21723, c19805));
                            if (c12107M15713.m30133() || C19808.m45042(c12107M15713, bufferedInputStream)) {
                                if (z) {
                                    C19808.m45037(m21722(), abstractC20745.mo33986());
                                }
                                return bufferedInputStream;
                            }
                            C19431.m44468(bufferedInputStream);
                            m21713(null);
                            if (zM16304) {
                                C19808.m45036();
                            }
                        } else {
                            zM16304 = false;
                        }
                        byte[] bArr2 = this.f28784;
                        String strM21724 = m21722();
                        if (m24614()) {
                            c19805 = c19806;
                        } else {
                            c19805 = null;
                        }
                        bufferedInputStream = new BufferedInputStream(C19808.m45033(c12107M15713, abstractC20745, bArr2, strM21724, c19805));
                        if (c12107M15713.m30133()) {
                        }
                        if (z) {
                            C19808.m45037(m21722(), abstractC20745.mo33986());
                        }
                        return bufferedInputStream;
                    } catch (C17978 e) {
                        if (c12107M15713.m30133()) {
                            m21713(null);
                            if (zM16304) {
                                C19808.m45036();
                            }
                        } else {
                            throw e;
                        }
                    }
                    z = false;
                }
            } else {
                String strM21725 = m21722();
                List listM45034 = null;
                while (!interfaceC5614.mo2357()) {
                    if (strM21725 == null || strM21725.isEmpty()) {
                        if (listM45034 == null) {
                            C2455 c2455M7448 = C2455.m7448(abstractC20745, this.f28784);
                            try {
                                listM45034 = C19808.m45034(c2455M7448, c12107M15713, interfaceC5614);
                                c2455M7448.close();
                            } catch (Throwable th) {
                                try {
                                    c2455M7448.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        AtomicReference atomicReference = new AtomicReference();
                        C6004 c6005 = new C6004(abstractActivityC12483, new C0297(atomicReference));
                        c6005.m16303(new BooleanSupplier() { // from class: l.᩸ܽ֨
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return interfaceC5614.mo2357();
                            }
                        });
                        if (!c6005.m16305(listM45034)) {
                            return null;
                        }
                        strM21725 = (String) atomicReference.get();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(C19808.m45033(c12107M15713, abstractC20745, this.f28784, strM21725, m24614() ? c19806 : null));
                        if (!C19808.m45042(c12107M15713, bufferedInputStream2)) {
                            C19431.m44468(bufferedInputStream2);
                            throw new C17978(c12107M15713.getName());
                        }
                        return new C18166(this, bufferedInputStream2, strM21725, z2);
                    } catch (C17978 unused) {
                        C11088.m27969(abstractC20745.mo33986(), strM21725);
                        if (z2) {
                            C19808.m45036();
                        }
                        strM21725 = null;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        if (this.f28791 == null) {
            mo10267(false);
        }
        C12107 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C5696(entry);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("zip".getBytes());
        C22253.m49418(messageDigest, this.f28786.mo33986());
        messageDigest.update(String.valueOf(this.f28785).getBytes());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6037 m21717() {
        C6037 c6037 = this.f28782;
        if (c6037 != null) {
            return c6037;
        }
        if (!this.f28793) {
            return null;
        }
        this.f28793 = false;
        try {
            if (this.f28788 == null) {
                mo10267(false);
            }
            C12107 c12107 = (C12107) this.f28791.get("resources.arsc");
            if (c12107 != null && c12107.getSize() < 15728640) {
                C2455 c2455M7448 = C2455.m7448(this.f28786, this.f28784);
                try {
                    this.f28782 = new C6037(0, new C1493(c2455M7448.m7471(c12107)));
                    c2455M7448.close();
                } catch (Throwable th) {
                    try {
                        c2455M7448.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return this.f28782;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        if (this.f28788 == null) {
            mo10267(false);
        }
        if (C21506.f69876) {
            str = C15489.m37076(str, "/zip/");
        }
        List listM25252 = this.f28787.m25252(str.substring(1));
        ArrayList arrayList = new ArrayList(listM25252.size() + 1);
        Iterator it = listM25252.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5696((C12107) it.next()));
        }
        return arrayList;
    }

    public final C12107 getEntry(String str) {
        Map map = this.f28791;
        if (map == null) {
            return null;
        }
        C12107 c12107 = (C12107) map.get(str);
        return (c12107 == null && str.endsWith("/")) ? (C12107) this.f28787.m25250(str) : c12107;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m21725() {
        return this.f28784;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m21724() {
        return this.f28784.length > 0;
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final List m21712() {
        return this.f28788;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
        c11018.m27786(this.f28786.mo33986());
        c11018.m27794(this.f28784);
        c11018.m27784(this.f28792);
        c11018.m27783(this.f28789);
        c11018.m27786(m21722());
        c11018.m27786(m21726());
        c11018.m27786(C12375.m30784(new C18872(this.f28788, this.f28791, this.f28787, this.f28785)));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m21715() {
        return this.f28786.mo33986();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m21723() {
        return this.f28786;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m21719() {
        return this.f28792;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m21721() {
        return this.f28789;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m21720() {
        return this.f28785 != this.f28786.mo33991();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m21711() {
        return this.f28786.mo33975();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21713(String str) {
        C11088.m27975(this.f28786.mo33986(), str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m21722() {
        return C11088.m27967(this.f28786.mo33986());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21718(Charset charset) {
        this.f28790 = charset;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m21726() {
        Charset charset = this.f28790;
        return charset == null ? "" : charset.name();
    }
}
