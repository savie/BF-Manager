package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12172 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f39147 = new C20377();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f39148;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 f39149;

    public C12172(C24522 c24522, AbstractC17567 abstractC17567, Class cls) {
        this.f39149 = new C7477(c24522, abstractC17567, cls);
        this.f39148 = cls;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c4208.m13441();
        while (c4208.m13457()) {
            arrayList.add(this.f39149.mo3722(c4208));
        }
        c4208.m13449();
        int size = arrayList.size();
        Class cls = this.f39148;
        if (cls.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(objNewInstance, i, arrayList.get(i));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        if (obj == null) {
            c21362.m48598();
            return;
        }
        c21362.m48585();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f39149.mo3723(c21362, Array.get(obj, i));
        }
        c21362.m48594();
    }
}
