package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes.dex */
public final class C21954 extends AbstractC13509 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f70863;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f70865;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f70862 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f70861 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f70864 = new HashMap();

    public C21954(String str, String str2) {
        this.f70865 = str2;
        this.f70863 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21954 m49683(C11511 c11511) {
        boolean zM28967 = c11511.m28967();
        AbstractC1817 abstractC1817 = c11511.f36226;
        if (zM28967) {
            this.f70862.put((C13003) abstractC1817, c11511);
            return this;
        }
        this.f70861.put((C15240) abstractC1817, c11511);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19716 m49682() {
        Map map;
        HashMap map2 = this.f70864;
        if (map2.isEmpty()) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map3 = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                map3.put((String) entry.getKey(), new C22700((List) entry.getValue()));
            }
            map = map3;
        }
        return new C19716(this.f70863, this.f70865, this.f70862, this.f70861, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49684(C17478 c17478, C13003 c13003, Object obj, String str) {
        ((List) C11392.computeIfAbsent(this.f70864, str, new C6376(2))).add(new C10765(c17478, c13003, obj, str));
    }
}
