package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes.dex */
public final class C23436 implements InterfaceC1914 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f75862;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2973 f75863;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f75864;

    public C23436(C2973 c2973, HashMap map, IOException[] iOExceptionArr) {
        this.f75863 = c2973;
        this.f75862 = map;
        this.f75864 = iOExceptionArr;
    }

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final void mo6226(InterfaceC2557 interfaceC2557, InputStream inputStream) throws IOException {
        C9033 c9033 = (C9033) this.f75862.get(interfaceC2557);
        C13638.requireNonNull(c9033);
        C2973 c2973 = this.f75863;
        if (inputStream == null) {
            c2973.f11114.m10992();
            return;
        }
        try {
            c2973.m8807(c9033);
            if (!c2973.m8803(c9033, interfaceC2557)) {
                if (!((C10695) c2973.f11109).f36506.mo2357()) {
                    c2973.m8797(inputStream, interfaceC2557.getSize(), true);
                    if (!((C10695) c2973.f11109).f36506.mo2357()) {
                        c2973.f11114.m10994(c9033.m26359());
                    }
                }
                inputStream.close();
                return;
            }
            AbstractC20745 abstractC20745M26394 = c9033.m26394();
            abstractC20745M26394.m46695(inputStream, interfaceC2557.getSize(), new C10736(this));
            if (((C10695) c2973.f11109).f36506.mo2357()) {
                abstractC20745M26394.mo24644();
                inputStream.close();
                return;
            }
            if (c9033.m26370() != null) {
                C5222 c5222 = new C5222();
                c5222.m14405(c9033.m26370());
                c5222.m14402(abstractC20745M26394);
            }
            c2973.f11107.m44616(c9033.m26393(), abstractC20745M26394.getName());
            c2973.f11114.m10994(c9033.m26359());
            C22252.m49408(c9033.m26385(), true);
            if (c9033.m26372() != null) {
                c2973.f11115.add((String) c9033.m26372());
            }
            if (c2973.f11113 && c9033.m26392() > 0 && abstractC20745M26394.mo8448()) {
                c2973.f11110.m23972(abstractC20745M26394, c9033.m26392());
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6227(IOException iOException) {
        this.f75864[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return ((C10695) this.f75863.f11109).mo2357();
    }
}
