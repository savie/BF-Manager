package l;

import android.media.MediaCodecInfo;
import bin.mt.plus.R;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10185 implements InterfaceC25138, InterfaceC24044 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m26293(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26294(String str, ComponentCallbacksC11612 componentCallbacksC11612, String str2) {
        return str + componentCallbacksC11612 + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Map m26295() {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("X-Content-Type-Options", "nosniff"), new AbstractMap.SimpleEntry("Cache-Control", "private, max-age=31536000")};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C17359.requireNonNull(key);
            Object value = entry.getValue();
            C17359.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C14483.m34971("duplicate key: ", key));
            }
        }
        return C4681.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24866 m26296(C1122 c1122, long j, String str, Object[] objArr) {
        c1122.mo4159(j, str, objArr);
        return new C24866();
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        int i = C8950.f29195;
        return null;
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo6271(C3906 c3906) {
        C25240 c25240 = (C25240) c3906;
        int i = c25240.m29658().getInt(c25240.m12557(), 0);
        boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        String[] strArrSplit = c25240.m12560().getString(R.string.MT_Protector).split("\\|");
        if (strArrSplit.length != 4) {
            throw new IllegalArgumentException(Arrays.toString(strArrSplit));
        }
        StringBuilder sb = new StringBuilder();
        if (zArr[0]) {
            sb.append(strArrSplit[1]);
        } else {
            sb.append(strArrSplit[0]);
        }
        sb.append(", ");
        if (zArr[1]) {
            sb.append(strArrSplit[3]);
        } else {
            sb.append(strArrSplit[2]);
        }
        return sb.toString();
    }
}
