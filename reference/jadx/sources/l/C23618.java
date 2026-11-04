package l;

import android.graphics.Typeface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Features;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.AnalyticsConstants;

/* JADX INFO: renamed from: l.᩹ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes.dex */
public final class C23618 {
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52858(C2148 c2148) throws ErrnoException {
        String strM18977;
        String strM45;
        String strM46;
        String str;
        AbstractC22044 abstractC22044M7414 = c2148.m7414();
        String str2 = "unknown";
        if (abstractC22044M7414 instanceof C18379) {
            if (C7756.m21111()) {
                try {
                    C21694 c21694M34906 = C14453.m34906(abstractC22044M7414.mo4294());
                    strM18977 = C6790.m18977(c21694M34906.m49241());
                    try {
                        strM45 = Features.m45(c21694M34906.m49242());
                        try {
                            strM46 = Features.m45(c21694M34906.m49233());
                            str2 = strM46;
                        } catch (ErrnoException | Exception unused) {
                        }
                    } catch (ErrnoException | Exception unused2) {
                        strM45 = "unknown";
                    }
                } catch (ErrnoException | Exception unused3) {
                    strM18977 = "unknown";
                    strM45 = strM18977;
                }
                str = str2;
                str2 = strM18977;
            } else {
                str = "unknown";
                strM45 = str;
            }
        } else if (abstractC22044M7414 instanceof C17063) {
            StructStat structStatLstat = Os.lstat(((C17063) abstractC22044M7414).m40200());
            strM18977 = C6790.m18977(structStatLstat.st_mode);
            strM45 = Features.m45(structStatLstat.st_uid);
            strM46 = Features.m45(structStatLstat.st_gid);
            str2 = strM46;
            str = str2;
            str2 = strM18977;
        } else {
            str = "unknown";
            strM45 = str;
        }
        StringBuilder sb = new StringBuilder("AndroidDataFileUnreadableException///");
        sb.append(abstractC22044M7414.mo4294());
        sb.append("///");
        sb.append(str2);
        sb.append("///");
        return C12669.m31438(sb, strM45, "///", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52859(AbstractActivityC17204 abstractActivityC17204, String str) {
        String[] strArrSplit = str.split("///");
        if (strArrSplit.length == 5) {
            m52860(abstractActivityC17204, strArrSplit[1], strArrSplit[2], strArrSplit[3], strArrSplit[4]);
        } else {
            abstractActivityC17204.m40400(str, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52860(AbstractActivityC17204 abstractActivityC17204, String str, String str2, String str3, String str4) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        int iIndexOf = str.indexOf(AnalyticsConstants.SDK_TYPE);
        if (iIndexOf != -1) {
            str = str.substring(iIndexOf);
        }
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC15284.m36687(textView, C11293.m28558(str));
        ViewOnClickListenerC15284.m36687(textView2, C11293.m28556(str));
        ViewOnClickListenerC15284.m36687(textView3, str2);
        ViewOnClickListenerC15284.m36687(textView4, str3);
        ViewOnClickListenerC15284.m36687(textView5, str4);
        if ("unknown".equals(str2)) {
            textView3.setTypeface(Typeface.DEFAULT);
        }
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC22412(abstractActivityC17204, 1));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }
}
