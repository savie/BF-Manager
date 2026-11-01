package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19970 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f63933 = new C15737();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f63934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 f63935;

    public C19970(C6044 c6044, AbstractC7186 abstractC7186, Class cls) {
        this.f63935 = new C16234(c6044, abstractC7186, cls);
        this.f63934 = cls;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c5379.m14913();
        while (c5379.m14924()) {
            arrayList.add(this.f63935.mo1571(c5379));
        }
        c5379.m14929();
        int size = arrayList.size();
        Class cls = this.f63934;
        if (cls.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(objNewInstance, i, arrayList.get(i));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        if (obj == null) {
            c1145.m4214();
            return;
        }
        c1145.m4200();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f63935.mo1572(c1145, Array.get(obj, i));
        }
        c1145.m4199();
    }
}
