package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UA */
/* JADX INFO: loaded from: classes.dex */
public final class C22419 extends AbstractC21803 implements InterfaceC23145, InterfaceC21733 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f73176;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11018 f73177;

    public C22419() {
        super(2);
        C11018 c11018 = new C11018();
        this.f73177 = c11018;
        this.f73176 = new LinkedHashMap();
        c11018.writeInt(67263238);
    }

    @Override // l.AbstractC21803, l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        String strM2211 = c12417.m2211();
        String strM8699 = C2892.m8699(c12417);
        String str = strM8699;
        if (strM8699 == null) {
            str = strM2211;
        }
        if (strM2211.equals(str)) {
            for (C17355 c17355 : c12417.m2204()) {
                String strM18509 = C6896.m18509(c17355);
                if (strM18509 == null || strM18509.equals(c17355.m39114())) {
                }
            }
            for (C11006 c11006 : c12417.m2203()) {
                String strM185010 = C6896.m18509(c11006);
                if (strM185010 == null || strM185010.equals(c11006.m39114())) {
                }
            }
            return;
        }
        C11018 c11018 = this.f73177;
        c11018.writeByte(1);
        c11018.writeInt(m49735(strM2211));
        c11018.writeInt(m49735(str));
        c12417.m2200((InterfaceC21733) this);
        c12417.m2210(this);
    }

    @Override // l.AbstractC21803, l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5128(C12417 c12417, C17355 c17355) {
        String strM18509 = C6896.m18509(c17355);
        String strM39114 = c17355.m39114();
        if (strM18509 == null) {
            strM18509 = c17355.m39114();
        }
        if (strM18509.equals(strM39114)) {
            return;
        }
        C11018 c11018 = this.f73177;
        c11018.writeByte(2);
        c11018.writeInt(m49735(c17355.m39118().mo13250()));
        c11018.writeInt(m49735(strM39114));
        c11018.writeInt(m49735(strM18509));
    }

    @Override // l.AbstractC21803, l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5127(C12417 c12417, C11006 c11006) {
        String strM18509 = C6896.m18509(c11006);
        String strM39114 = c11006.m39114();
        if (strM18509 == null) {
            strM18509 = strM39114;
        }
        if (strM18509.equals(strM39114)) {
            return;
        }
        C11018 c11018 = this.f73177;
        c11018.writeByte(3);
        c11018.writeInt(m49735(c11006.m39118().mo13250()));
        c11018.writeInt(m49735(strM39114));
        c11018.writeInt(m49735(strM18509));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m49737() {
        C11018 c11018 = this.f73177;
        int i = 0;
        c11018.writeByte(0);
        int size = c11018.size();
        LinkedHashMap linkedHashMap = this.f73176;
        c11018.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i2 = i + 1;
            if (i != ((Integer) entry.getValue()).intValue()) {
                throw new RuntimeException();
            }
            c11018.m27782((CharSequence) entry.getKey());
            i = i2;
        }
        c11018.writeInt(size);
        c11018.writeInt(67263238);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49736(OutputStream outputStream) throws IOException {
        this.f73177.m27780(outputStream);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m49735(String str) {
        LinkedHashMap linkedHashMap = this.f73176;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
