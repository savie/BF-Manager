package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۗۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public class C2935 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f11024 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8755(BufferedInputStream bufferedInputStream, AbstractC20745 abstractC20745, long j, C8516 c8516) throws IOException {
        int i;
        OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
        try {
            byte[] bArr = new byte[1024];
            while (j > 0 && (i = bufferedInputStream.read(bArr, 0, (int) Math.min(1024, j))) != -1) {
                c8516.m22242(i);
                outputStreamMo33976.write(bArr, 0, i);
                j -= (long) i;
                if (mo2357()) {
                    break;
                }
            }
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
            if (mo2357()) {
                abstractC20745.mo24647();
            } else {
                this.f11024.add(abstractC20745.getName());
            }
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5729;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, C6730.m18175(m41585("file")), C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        AbstractC20745 abstractC20745M41587 = m41587("file");
        C0113 c0113 = (C0113) m41584("arguments");
        String strM41585 = m41585("pattern");
        C2462.m7542(abstractC20745M41587, EnumC11636.MODIFY_DIRECTORY);
        try {
            if (!c0113.m1153()) {
                m8756(abstractC20745M41587, c0113, strM41585);
            } else {
                long jMo33964 = abstractC20745M41587.mo33964();
                C8516 c8516 = new C8516(jMo33964 > 4611686018427387903L ? C17492.FOREVER_NS : jMo33964 * 2);
                c8516.m22241(new C1359(3, this));
                C22069.m49006(new C5758(abstractC20745M41587), new C9287(this, abstractC20745M41587, strM41585), c0113, c8516, new C1188(this));
            }
        } catch (C14226 unused) {
        }
        if (!mo2357() && c0113.f1090) {
            abstractC20745M41587.mo24644();
        }
        return m41583();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8756(AbstractC20745 abstractC20745, C0113 c0113, String str) throws IOException {
        int i;
        long j;
        long j2;
        int i2;
        int length;
        int i3;
        String strM8757;
        long j3;
        long j4;
        String parent;
        AbstractC20745 abstractC20745M15313;
        long jMo33964 = abstractC20745.mo33964();
        C8516 c8516 = new C8516(jMo33964);
        c8516.m22241(new C1359(3, this));
        BufferedInputStream bufferedInputStreamM46719 = abstractC20745.m46719();
        try {
            if (c0113.f1088 == 0) {
                j = ((long) c0113.f1091) * (1 << (c0113.f1095 * 10));
                i = (int) (jMo33964 / j);
                if (((long) i) * j != jMo33964 || i == 0) {
                    i++;
                }
            } else {
                i = c0113.f1094;
                j = jMo33964 / ((long) i);
                if (j < 1 && j < jMo33964) {
                    j2 = 1;
                }
                i2 = (int) (jMo33964 - (((long) i) * j2));
                length = String.valueOf(i).length();
                i3 = 1;
                while (i3 <= i && !mo2357()) {
                    strM8757 = m8757(i3, length, str);
                    mo41554(strM8757);
                    if (i3 == i) {
                        j4 = C17492.FOREVER_NS;
                    } else {
                        if (i - i3 < i2) {
                            j4 = j2 + 1;
                        } else {
                            j3 = j2;
                        }
                        parent = abstractC20745.getParent();
                        if (parent == null) {
                            abstractC20745M15313 = null;
                        } else {
                            abstractC20745M15313 = C5553.m15313(parent, strM8757);
                        }
                        long j5 = j3;
                        int i4 = i3;
                        m8755(bufferedInputStreamM46719, abstractC20745M15313, j5, c8516);
                        i3 = i4 + 1;
                    }
                    j3 = j4;
                    parent = abstractC20745.getParent();
                    if (parent == null) {
                        abstractC20745M15313 = null;
                    } else {
                        abstractC20745M15313 = C5553.m15313(parent, strM8757);
                    }
                    long j6 = j3;
                    int i5 = i3;
                    m8755(bufferedInputStreamM46719, abstractC20745M15313, j6, c8516);
                    i3 = i5 + 1;
                }
                bufferedInputStreamM46719.close();
            }
            j2 = j;
            i2 = (int) (jMo33964 - (((long) i) * j2));
            length = String.valueOf(i).length();
            i3 = 1;
            while (i3 <= i) {
                strM8757 = m8757(i3, length, str);
                mo41554(strM8757);
                if (i3 == i) {
                    j4 = C17492.FOREVER_NS;
                } else {
                    if (i - i3 < i2) {
                        j4 = j2 + 1;
                    } else {
                        j3 = j2;
                    }
                    parent = abstractC20745.getParent();
                    if (parent == null) {
                        abstractC20745M15313 = null;
                    } else {
                        abstractC20745M15313 = C5553.m15313(parent, strM8757);
                    }
                    long j7 = j3;
                    int i6 = i3;
                    m8755(bufferedInputStreamM46719, abstractC20745M15313, j7, c8516);
                    i3 = i6 + 1;
                }
                j3 = j4;
                parent = abstractC20745.getParent();
                if (parent == null) {
                    abstractC20745M15313 = null;
                } else {
                    abstractC20745M15313 = C5553.m15313(parent, strM8757);
                }
                long j8 = j3;
                int i7 = i3;
                m8755(bufferedInputStreamM46719, abstractC20745M15313, j8, c8516);
                i3 = i7 + 1;
            }
            bufferedInputStreamM46719.close();
        } catch (Throwable th) {
            try {
                bufferedInputStreamM46719.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        ArrayList arrayList = this.f11024;
        if (arrayList.isEmpty() || !m41579(c11545)) {
            return;
        }
        c11545.m28777((Collection) arrayList);
        c11545.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m8757(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        while (sb.length() < i2) {
            sb.insert(0, '0');
        }
        return str.replace("{D}", sb.toString());
    }
}
