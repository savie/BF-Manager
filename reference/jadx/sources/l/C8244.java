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

/* JADX INFO: renamed from: l.۠ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8244 {
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21621(C6237 c6237) throws ErrnoException {
        String strM33382;
        String strM56;
        String strM57;
        String str;
        AbstractC20745 abstractC20745M17293 = c6237.m17293();
        String str2 = "unknown";
        if (abstractC20745M17293 instanceof C17196) {
            if (C6696.m18097()) {
                try {
                    C5574 c5574M951 = C0055.m951(abstractC20745M17293.mo33986());
                    strM33382 = C13672.m33382(c5574M951.m15390());
                    try {
                        strM56 = Features.m56(c5574M951.m15399());
                        try {
                            strM57 = Features.m56(c5574M951.m15392());
                            str2 = strM57;
                        } catch (ErrnoException | Exception unused) {
                        }
                    } catch (ErrnoException | Exception unused2) {
                        strM56 = "unknown";
                    }
                } catch (ErrnoException | Exception unused3) {
                    strM33382 = "unknown";
                    strM56 = strM33382;
                }
                str = str2;
                str2 = strM33382;
            } else {
                str = "unknown";
                strM56 = str;
            }
        } else if (abstractC20745M17293 instanceof C14705) {
            StructStat structStatLstat = Os.lstat(((C14705) abstractC20745M17293).m35232());
            strM33382 = C13672.m33382(structStatLstat.st_mode);
            strM56 = Features.m56(structStatLstat.st_uid);
            strM57 = Features.m56(structStatLstat.st_gid);
            str2 = strM57;
            str = str2;
            str2 = strM33382;
        } else {
            str = "unknown";
            strM56 = str;
        }
        StringBuilder sb = new StringBuilder("AndroidDataFileUnreadableException///");
        sb.append(abstractC20745M17293.mo33986());
        sb.append("///");
        sb.append(str2);
        sb.append("///");
        return C1694.m5622(sb, strM56, "///", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21622(AbstractActivityC12483 abstractActivityC12483, String str) {
        String[] strArrSplit = str.split("///");
        if (strArrSplit.length == 5) {
            m21623(abstractActivityC12483, strArrSplit[1], strArrSplit[2], strArrSplit[3], strArrSplit[4]);
        } else {
            abstractActivityC12483.m31000(str, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21623(AbstractActivityC12483 abstractActivityC12483, String str, String str2, String str3, String str4) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        int iIndexOf = str.indexOf(AnalyticsConstants.SDK_TYPE);
        if (iIndexOf != -1) {
            str = str.substring(iIndexOf);
        }
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC22523.m50035(textView, C6730.m18175(str));
        ViewOnClickListenerC22523.m50035(textView2, C6730.m18172(str));
        ViewOnClickListenerC22523.m50035(textView3, str2);
        ViewOnClickListenerC22523.m50035(textView4, str3);
        ViewOnClickListenerC22523.m50035(textView5, str4);
        if ("unknown".equals(str2)) {
            textView3.setTypeface(Typeface.DEFAULT);
        }
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC0653(3, abstractActivityC12483));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }
}
