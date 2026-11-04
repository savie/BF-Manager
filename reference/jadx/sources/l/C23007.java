package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UA */
/* JADX INFO: loaded from: classes.dex */
public final class C23007 extends AbstractC21976 implements InterfaceC5656, InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6178 f74668;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f74669;

    public C23007() {
        C6178 c6178 = new C6178();
        this.f74668 = c6178;
        this.f74669 = new LinkedHashMap();
        c6178.writeInt(67263238);
    }

    @Override // l.AbstractC21976, l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        String strM13516 = c21383.m13516();
        String strM23832 = C8923.m23832(c21383);
        String str = strM23832;
        if (strM23832 == null) {
            str = strM13516;
        }
        if (strM13516.equals(str)) {
            for (C18399 c18399 : c21383.m13513()) {
                String strM17036 = C5853.m17036(c18399);
                if (strM17036 == null || strM17036.equals(c18399.m35295())) {
                }
            }
            for (C7958 c7958 : c21383.m13517()) {
                String strM17037 = C5853.m17036(c7958);
                if (strM17037 == null || strM17037.equals(c7958.m35295())) {
                }
            }
            return;
        }
        C6178 c6178 = this.f74668;
        c6178.writeByte(1);
        c6178.writeInt(m51898(strM13516));
        c6178.writeInt(m51898(str));
        c21383.m13508((InterfaceC11621) this);
        c21383.m13521(this);
    }

    @Override // l.AbstractC21976, l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6610(C21383 c21383, C18399 c18399) {
        String strM17036 = C5853.m17036(c18399);
        String strM35295 = c18399.m35295();
        if (strM17036 == null) {
            strM17036 = c18399.m35295();
        }
        if (strM17036.equals(strM35295)) {
            return;
        }
        C6178 c6178 = this.f74668;
        c6178.writeByte(2);
        c6178.writeInt(m51898(c18399.m35293().mo15452()));
        c6178.writeInt(m51898(strM35295));
        c6178.writeInt(m51898(strM17036));
    }

    @Override // l.AbstractC21976, l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6609(C21383 c21383, C7958 c7958) {
        String strM17036 = C5853.m17036(c7958);
        String strM35295 = c7958.m35295();
        if (strM17036 == null) {
            strM17036 = strM35295;
        }
        if (strM17036.equals(strM35295)) {
            return;
        }
        C6178 c6178 = this.f74668;
        c6178.writeByte(3);
        c6178.writeInt(m51898(c7958.m35293().mo15452()));
        c6178.writeInt(m51898(strM35295));
        c6178.writeInt(m51898(strM17036));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51899() {
        C6178 c6178 = this.f74668;
        int i = 0;
        c6178.writeByte(0);
        int size = c6178.size();
        LinkedHashMap linkedHashMap = this.f74669;
        c6178.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i2 = i + 1;
            if (i != ((Integer) entry.getValue()).intValue()) {
                throw new RuntimeException();
            }
            c6178.m17786((CharSequence) entry.getKey());
            i = i2;
        }
        c6178.writeInt(size);
        c6178.writeInt(67263238);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51900(OutputStream outputStream) throws IOException {
        this.f74668.m17784(outputStream);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m51898(String str) {
        LinkedHashMap linkedHashMap = this.f74669;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
