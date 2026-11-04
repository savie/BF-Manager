package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۢܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public class C10257 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f32755 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26444(BufferedInputStream bufferedInputStream, AbstractC22044 abstractC22044, long j, C3374 c3374) throws IOException {
        int i;
        OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
        try {
            byte[] bArr = new byte[1024];
            while (j > 0 && (i = bufferedInputStream.read(bArr, 0, (int) Math.min(1024, j))) != -1) {
                c3374.m11079(i);
                outputStreamMo4289.write(bArr, 0, i);
                j -= (long) i;
                if (mo924()) {
                    break;
                }
            }
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
            if (mo924()) {
                abstractC22044.mo4296();
            } else {
                this.f32755.add(abstractC22044.getName());
            }
        } catch (Throwable th) {
            if (outputStreamMo4289 != null) {
                try {
                    outputStreamMo4289.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46060;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, C11293.m28558(m43865("file")), C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        AbstractC22044 abstractC22044M43860 = m43860("file");
        C12495 c12495 = (C12495) m43853("arguments");
        String strM43865 = m43865("pattern");
        C6265.m17913(abstractC22044M43860, EnumC12230.MODIFY_DIRECTORY);
        try {
            int i = c12495.f40122;
            if (!(i == 2 || i == 3)) {
                m26445(abstractC22044M43860, c12495, strM43865);
            } else {
                long jMo4285 = abstractC22044M43860.mo4285();
                C3374 c3374 = new C3374(jMo4285 > 4611686018427387903L ? C25227.FOREVER_NS : jMo4285 * 2);
                c3374.m11078(new C13809(3, this));
                C13986.m34075(new C14732(abstractC22044M43860), new C19208(this, abstractC22044M43860, strM43865), c12495, c3374, new C5256(2, this));
            }
        } catch (C0563 unused) {
        }
        if (!mo924() && c12495.f40116) {
            abstractC22044M43860.mo4287();
        }
        return m43857();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26445(AbstractC22044 abstractC22044, C12495 c12495, String str) throws IOException {
        int i;
        long j;
        long j2;
        int i2;
        int length;
        int i3;
        String strM26446;
        long j3;
        long j4;
        String parent;
        AbstractC22044 abstractC22044M35193;
        long jMo4285 = abstractC22044.mo4285();
        C3374 c3374 = new C3374(jMo4285);
        c3374.m11078(new C13809(3, this));
        BufferedInputStream bufferedInputStreamM49875 = abstractC22044.m49875();
        try {
            if (c12495.f40122 == 0) {
                j = ((long) c12495.f40119) * (1 << (c12495.f40126 * 10));
                i = (int) (jMo4285 / j);
                if (((long) i) * j != jMo4285 || i == 0) {
                    i++;
                }
            } else {
                i = c12495.f40115;
                j = jMo4285 / ((long) i);
                if (j < 1 && j < jMo4285) {
                    j2 = 1;
                }
                i2 = (int) (jMo4285 - (((long) i) * j2));
                length = String.valueOf(i).length();
                i3 = 1;
                while (i3 <= i && !mo924()) {
                    strM26446 = m26446(i3, length, str);
                    mo29447(strM26446);
                    if (i3 == i) {
                        j4 = C25227.FOREVER_NS;
                    } else {
                        if (i - i3 < i2) {
                            j4 = j2 + 1;
                        } else {
                            j3 = j2;
                        }
                        parent = abstractC22044.getParent();
                        if (parent == null) {
                            abstractC22044M35193 = null;
                        } else {
                            abstractC22044M35193 = C14584.m35193(parent, strM26446);
                        }
                        long j5 = j3;
                        int i4 = i3;
                        m26444(bufferedInputStreamM49875, abstractC22044M35193, j5, c3374);
                        i3 = i4 + 1;
                    }
                    j3 = j4;
                    parent = abstractC22044.getParent();
                    if (parent == null) {
                        abstractC22044M35193 = null;
                    } else {
                        abstractC22044M35193 = C14584.m35193(parent, strM26446);
                    }
                    long j6 = j3;
                    int i5 = i3;
                    m26444(bufferedInputStreamM49875, abstractC22044M35193, j6, c3374);
                    i3 = i5 + 1;
                }
                bufferedInputStreamM49875.close();
            }
            j2 = j;
            i2 = (int) (jMo4285 - (((long) i) * j2));
            length = String.valueOf(i).length();
            i3 = 1;
            while (i3 <= i) {
                strM26446 = m26446(i3, length, str);
                mo29447(strM26446);
                if (i3 == i) {
                    j4 = C25227.FOREVER_NS;
                } else {
                    if (i - i3 < i2) {
                        j4 = j2 + 1;
                    } else {
                        j3 = j2;
                    }
                    parent = abstractC22044.getParent();
                    if (parent == null) {
                        abstractC22044M35193 = null;
                    } else {
                        abstractC22044M35193 = C14584.m35193(parent, strM26446);
                    }
                    long j7 = j3;
                    int i6 = i3;
                    m26444(bufferedInputStreamM49875, abstractC22044M35193, j7, c3374);
                    i3 = i6 + 1;
                }
                j3 = j4;
                parent = abstractC22044.getParent();
                if (parent == null) {
                    abstractC22044M35193 = null;
                } else {
                    abstractC22044M35193 = C14584.m35193(parent, strM26446);
                }
                long j8 = j3;
                int i7 = i3;
                m26444(bufferedInputStreamM49875, abstractC22044M35193, j8, c3374);
                i3 = i7 + 1;
            }
            bufferedInputStreamM49875.close();
        } catch (Throwable th) {
            try {
                bufferedInputStreamM49875.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        ArrayList arrayList = this.f32755;
        if (arrayList.isEmpty() || !m43863(c8614)) {
            return;
        }
        c8614.m23176((Collection) arrayList);
        c8614.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m26446(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        while (sb.length() < i2) {
            sb.insert(0, '0');
        }
        return str.replace("{D}", sb.toString());
    }
}
