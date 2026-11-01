package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11985 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f40133;

    public C11985(ArrayList arrayList) throws C5634 {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14310 c14310 = (C14310) it.next();
            if (map.put(c14310.f46874, c14310.f46875) != null) {
                throw new C5634("Duplicate signed attribute: " + c14310.f46874);
            }
        }
        this.f40133 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1525 m29791(String str) throws C5634 {
        List list = (List) this.f40133.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() <= 1) {
            return (C1525) list.get(0);
        }
        throw new C5634(C16523.m38890("Attribute ", str, " has multiple values"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29792() throws C5634 {
        C1525 c1525M29791 = m29791("1.2.840.113549.1.9.3");
        if (c1525M29791 == null) {
            return null;
        }
        try {
            return ((C4928) C20576.m46426(c1525M29791.m5292(), C4928.class)).f17258;
        } catch (C19871 e) {
            throw new C5634("Failed to decode OBJECT IDENTIFIER", e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m29793() throws C5634 {
        C1525 c1525M29791 = m29791("1.2.840.113549.1.9.4");
        if (c1525M29791 == null) {
            return null;
        }
        try {
            return ((C14102) C20576.m46426(c1525M29791.m5292(), C14102.class)).f46337;
        } catch (C19871 e) {
            throw new C5634("Failed to decode OBJECT IDENTIFIER", e);
        }
    }
}
