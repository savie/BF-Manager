package l;

import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֨ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370 extends AbstractC11800 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f4873;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f4874;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f4875;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View f4876;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f4877;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f4878;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f4879;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14113 f4880;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f4881;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f4882;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f4883;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f4884;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0465 f4885;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final TextView f4886;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f4887;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f4888;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9572 f4889;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ProgressBar f4890;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370(ActivityC9572 activityC9572, View view) {
        super(view);
        this.f4889 = activityC9572;
        this.f4886 = (TextView) view.findViewById(R.id.logTitle);
        this.f4873 = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f4890 = (ProgressBar) view.findViewById(R.id.MT_Protector);
        this.f4881 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f4887 = (TextView) view.findViewById(R.id.logAppName);
        this.f4882 = (TextView) view.findViewById(R.id.logTarget);
        this.f4879 = (TextView) view.findViewById(R.id.logTool);
        this.f4884 = (TextView) view.findViewById(R.id.logStartTime);
        this.f4888 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f4877 = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.logResult);
        this.f4883 = textView;
        this.f4874 = (TextView) view.findViewById(R.id.logTimings);
        this.f4885 = (C0465) view.findViewById(R.id.MT_Protector);
        View viewFindViewById = view.findViewById(R.id.logHeader);
        this.f4876 = viewFindViewById;
        this.f4878 = textView.getCurrentTextColor();
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ۢᩴۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1370 c1370 = this.f32920;
                ActivityC9572 activityC9573 = c1370.f4889;
                if (c1370.f4880 == null) {
                    return;
                }
                long j = activityC9573.f30974;
                long j2 = c1370.f4880.f44634;
                if (j == j2) {
                    j2 = -1;
                }
                activityC9573.f30974 = j2;
                for (int i = 0; i < activityC9573.f30976.getChildCount(); i++) {
                    C1370 c1371 = (C1370) activityC9573.f30976.getChildViewHolder(activityC9573.f30976.getChildAt(i));
                    C14113 c14113 = c1371.f4880;
                    if (c14113 != null) {
                        c1371.m5052(c14113);
                    }
                }
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5052(C14113 c14113) {
        String string;
        int i;
        int i2;
        String string2;
        int i3;
        this.f4880 = c14113;
        int i4 = c14113.f44623;
        String str = c14113.f44633;
        String str2 = c14113.f44625;
        String str3 = c14113.f44632;
        String str4 = c14113.f44624;
        EnumC4836 enumC4836 = c14113.f44628;
        String str5 = c14113.f44627;
        ActivityC9572 activityC9572 = this.f4889;
        if (i4 == 0) {
            str5.getClass();
            byte b = -1;
            switch (str5.hashCode()) {
                case -2123511115:
                    if (str5.equals("mt_file_create_directory")) {
                        b = 0;
                    }
                    break;
                case -1971780391:
                    if (str5.equals("mt_file_get_access_policy")) {
                        b = 1;
                    }
                    break;
                case -1888249149:
                    if (str5.equals("mt_apk_search")) {
                        b = 2;
                    }
                    break;
                case -1862022498:
                    if (str5.equals("mt_apk_dex_xref")) {
                        b = 3;
                    }
                    break;
                case -1857179271:
                    if (str5.equals("mt_apk_patch_bytes")) {
                        b = 4;
                    }
                    break;
                case -1827097805:
                    if (str5.equals("mt_file_search")) {
                        b = 5;
                    }
                    break;
                case -1763539933:
                    if (str5.equals("mt_file_transfer_cancel")) {
                        b = 6;
                    }
                    break;
                case -1647468000:
                    if (str5.equals("mt_apk_resource_edit")) {
                        b = 7;
                    }
                    break;
                case -1647254348:
                    if (str5.equals("mt_apk_resource_list")) {
                        b = 8;
                    }
                    break;
                case -1647080020:
                    if (str5.equals("mt_apk_resource_read")) {
                        b = 9;
                    }
                    break;
                case -1646888655:
                    if (str5.equals("mt_apk_resource_xref")) {
                        b = 10;
                    }
                    break;
                case -1458504493:
                    if (str5.equals("mt_apk_native_disassemble")) {
                        b = 11;
                    }
                    break;
                case -1346956598:
                    if (str5.equals("mt_apk_list_entries")) {
                        b = 12;
                    }
                    break;
                case -1274719382:
                    if (str5.equals("mt_apk_read_signature")) {
                        b = cb.k;
                    }
                    break;
                case -1174937436:
                    if (str5.equals("mt_file_delete_directory")) {
                        b = cb.f82047l;
                    }
                    break;
                case -1132361204:
                    if (str5.equals("mt_apk_native_list_items")) {
                        b = 15;
                    }
                    break;
                case -1070178551:
                    if (str5.equals("mt_file_patch_bytes")) {
                        b = 16;
                    }
                    break;
                case -992889017:
                    if (str5.equals("mt_apk_edit_text")) {
                        b = 17;
                    }
                    break;
                case -982194168:
                    if (str5.equals("mt_apk_native_xref")) {
                        b = 18;
                    }
                    break;
                case -907410957:
                    if (str5.equals("mt_apk_build")) {
                        b = 19;
                    }
                    break;
                case -894221867:
                    if (str5.equals("mt_apk_native_patch_string")) {
                        b = 20;
                    }
                    break;
                case -467411567:
                    if (str5.equals("mt_apk_dex_read_pseudocode")) {
                        b = 21;
                    }
                    break;
                case -462719868:
                    if (str5.equals("mt_apk_native_map_address")) {
                        b = 22;
                    }
                    break;
                case -308599703:
                    if (str5.equals("mt_apk_native_patch_instructions")) {
                        b = 23;
                    }
                    break;
                case -299333417:
                    if (str5.equals("mt_file_edit_text")) {
                        b = 24;
                    }
                    break;
                case -283853312:
                    if (str5.equals("mt_zip_read_text")) {
                        b = 25;
                    }
                    break;
                case -240311493:
                    if (str5.equals("mt_apk_read_text")) {
                        b = 26;
                    }
                    break;
                case -225549832:
                    if (str5.equals("mt_zip_read_bytes")) {
                        b = 27;
                    }
                    break;
                case -224001040:
                    if (str5.equals("mt_apk_workspace_delete")) {
                        b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                    }
                    break;
                case -207074976:
                    if (str5.equals("mt_file_write_bytes")) {
                        b = 29;
                    }
                    break;
                case -22322168:
                    if (str5.equals("mt_apk_dex_list_classes")) {
                        b = 30;
                    }
                    break;
                case 250516771:
                    if (str5.equals("mt_file_replace_text")) {
                        b = bo.j;
                    }
                    break;
                case 317338069:
                    if (str5.equals("mt_apk_dex_read_class_outline")) {
                        b = UTF8.S_CS3;
                    }
                    break;
                case 341208724:
                    if (str5.equals("mt_zip_list")) {
                        b = PublicSuffixDatabase.EXCEPTION_MARKER;
                    }
                    break;
                case 341443208:
                    if (str5.equals("mt_zip_test")) {
                        b = 34;
                    }
                    break;
                case 386458560:
                    if (str5.equals("mt_file_copy")) {
                        b = 35;
                    }
                    break;
                case 386721001:
                    if (str5.equals("mt_file_list")) {
                        b = 36;
                    }
                    break;
                case 386756636:
                    if (str5.equals("mt_file_move")) {
                        b = 37;
                    }
                    break;
                case 386939551:
                    if (str5.equals("mt_file_stat")) {
                        b = 38;
                    }
                    break;
                case 408889875:
                    if (str5.equals("mt_apk_list_available_apks")) {
                        b = 39;
                    }
                    break;
                case 453244107:
                    if (str5.equals("mt_file_read_text")) {
                        b = 40;
                    }
                    break;
                case 462356615:
                    if (str5.equals("mt_file_append_text")) {
                        b = 41;
                    }
                    break;
                case 505070749:
                    if (str5.equals("mt_apk_list_installed_apps")) {
                        b = 42;
                    }
                    break;
                case 536886279:
                    if (str5.equals("mt_apk_native_inspect")) {
                        b = 43;
                    }
                    break;
                case 707888898:
                    if (str5.equals("mt_apk_continue")) {
                        b = 44;
                    }
                    break;
                case 714809027:
                    if (str5.equals("mt_apk_copy_entry")) {
                        b = 45;
                    }
                    break;
                case 769908445:
                    if (str5.equals("mt_file_truncate_bytes")) {
                        b = 46;
                    }
                    break;
                case 778136011:
                    if (str5.equals("mt_apk_resource_add")) {
                        b = 47;
                    }
                    break;
                case 978779171:
                    if (str5.equals("mt_apk_workspace_list")) {
                        b = UTF8.S_P3A;
                    }
                    break;
                case 978874831:
                    if (str5.equals("mt_apk_workspace_open")) {
                        b = 49;
                    }
                    break;
                case 1011302619:
                    if (str5.equals("mt_file_transfer_create_upload")) {
                        b = 50;
                    }
                    break;
                case 1063038178:
                    if (str5.equals("mt_file_transfer_create_download")) {
                        b = 51;
                    }
                    break;
                case 1124246557:
                    if (str5.equals("mt_apk_read_bytes")) {
                        b = 52;
                    }
                    break;
                case 1149633677:
                    if (str5.equals("mt_file_read_bytes")) {
                        b = 53;
                    }
                    break;
                case 1234286962:
                    if (str5.equals("mt_zip_create")) {
                        b = 54;
                    }
                    break;
                case 1314084816:
                    if (str5.equals("mt_apk_native_analyze_control_flow")) {
                        b = 55;
                    }
                    break;
                case 1432121425:
                    if (str5.equals("mt_file_append_bytes")) {
                        b = 56;
                    }
                    break;
                case 1569313483:
                    if (str5.equals("mt_zip_extract")) {
                        b = 57;
                    }
                    break;
                case 1583059936:
                    if (str5.equals("mt_apk_install")) {
                        b = 58;
                    }
                    break;
                case 1598557249:
                    if (str5.equals("mt_apk_resource_delete")) {
                        b = 59;
                    }
                    break;
                case 1626482986:
                    if (str5.equals("mt_apk_delete_target")) {
                        b = 60;
                    }
                    break;
                case 1642795232:
                    if (str5.equals("mt_apk_session_create")) {
                        b = Base32Encoder.DEFAULT_PADDING;
                    }
                    break;
                case 1747734847:
                    if (str5.equals("mt_zip_update")) {
                        b = 62;
                    }
                    break;
                case 1809273529:
                    if (str5.equals("mt_file_search_text")) {
                        b = 63;
                    }
                    break;
                case 1853810852:
                    if (str5.equals("mt_apk_session_check")) {
                        b = 64;
                    }
                    break;
                case 1941193293:
                    if (str5.equals("mt_file_transfer_get")) {
                        b = 65;
                    }
                    break;
                case 2038747958:
                    if (str5.equals("mt_file_delete")) {
                        b = 66;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    i3 = R.string.MT_Protector;
                    break;
                case 1:
                    i3 = R.string.MT_Protector;
                    break;
                case 2:
                    i3 = R.string.MT_Protector;
                    break;
                case 3:
                    i3 = R.string.MT_Protector;
                    break;
                case 4:
                    i3 = R.string.MT_Protector;
                    break;
                case 5:
                    i3 = R.string.MT_Protector;
                    break;
                case 6:
                    i3 = R.string.MT_Protector;
                    break;
                case 7:
                    i3 = R.string.MT_Protector;
                    break;
                case 8:
                    i3 = R.string.MT_Protector;
                    break;
                case 9:
                    i3 = R.string.MT_Protector;
                    break;
                case 10:
                    i3 = R.string.MT_Protector;
                    break;
                case 11:
                    i3 = R.string.MT_Protector;
                    break;
                case 12:
                    i3 = R.string.MT_Protector;
                    break;
                case 13:
                    i3 = R.string.MT_Protector;
                    break;
                case 14:
                    i3 = R.string.MT_Protector;
                    break;
                case 15:
                    i3 = R.string.MT_Protector;
                    break;
                case 16:
                    i3 = R.string.MT_Protector;
                    break;
                case 17:
                    i3 = R.string.MT_Protector;
                    break;
                case 18:
                    i3 = R.string.MT_Protector;
                    break;
                case 19:
                    i3 = R.string.MT_Protector;
                    break;
                case 20:
                    i3 = R.string.MT_Protector;
                    break;
                case 21:
                    i3 = R.string.MT_Protector;
                    break;
                case 22:
                    i3 = R.string.MT_Protector;
                    break;
                case 23:
                    i3 = R.string.MT_Protector;
                    break;
                case 24:
                    i3 = R.string.MT_Protector;
                    break;
                case 25:
                    i3 = R.string.MT_Protector;
                    break;
                case 26:
                    i3 = R.string.MT_Protector;
                    break;
                case 27:
                    i3 = R.string.MT_Protector;
                    break;
                case 28:
                    i3 = R.string.MT_Protector;
                    break;
                case 29:
                    i3 = R.string.MT_Protector;
                    break;
                case 30:
                    i3 = R.string.MT_Protector;
                    break;
                case 31:
                    i3 = R.string.MT_Protector;
                    break;
                case 32:
                    i3 = R.string.MT_Protector;
                    break;
                case 33:
                    i3 = R.string.MT_Protector;
                    break;
                case 34:
                    i3 = R.string.MT_Protector;
                    break;
                case 35:
                    i3 = R.string.MT_Protector;
                    break;
                case 36:
                    i3 = R.string.MT_Protector;
                    break;
                case 37:
                    i3 = R.string.MT_Protector;
                    break;
                case 38:
                    i3 = R.string.MT_Protector;
                    break;
                case 39:
                    i3 = R.string.MT_Protector;
                    break;
                case 40:
                    i3 = R.string.MT_Protector;
                    break;
                case 41:
                    i3 = R.string.MT_Protector;
                    break;
                case 42:
                    i3 = R.string.MT_Protector;
                    break;
                case 43:
                    i3 = R.string.MT_Protector;
                    break;
                case 44:
                    i3 = R.string.MT_Protector;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    i3 = R.string.MT_Protector;
                    break;
                case 46:
                    i3 = R.string.MT_Protector;
                    break;
                case 47:
                    i3 = R.string.MT_Protector;
                    break;
                case 48:
                    i3 = R.string.MT_Protector;
                    break;
                case 49:
                    i3 = R.string.MT_Protector;
                    break;
                case 50:
                    i3 = R.string.MT_Protector;
                    break;
                case 51:
                    i3 = R.string.MT_Protector;
                    break;
                case 52:
                    i3 = R.string.MT_Protector;
                    break;
                case 53:
                    i3 = R.string.MT_Protector;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    i3 = R.string.MT_Protector;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    i3 = R.string.MT_Protector;
                    break;
                case 56:
                    i3 = R.string.MT_Protector;
                    break;
                case 57:
                    i3 = R.string.MT_Protector;
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    i3 = R.string.MT_Protector;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    i3 = R.string.MT_Protector;
                    break;
                case 60:
                    i3 = R.string.MT_Protector;
                    break;
                case 61:
                    i3 = R.string.MT_Protector;
                    break;
                case 62:
                    i3 = R.string.MT_Protector;
                    break;
                case 63:
                    i3 = R.string.MT_Protector;
                    break;
                case 64:
                    i3 = R.string.MT_Protector;
                    break;
                case 65:
                    i3 = R.string.MT_Protector;
                    break;
                case 66:
                    i3 = R.string.MT_Protector;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            string = i3 == 0 ? str5 : activityC9572.getString(i3);
        } else {
            string = activityC9572.getString(i4);
            if (str5.equals("mt_apk_continue")) {
                string = activityC9572.getString(R.string.MT_Protector, string);
            }
        }
        this.f4886.setText(string);
        boolean z = (str4 == null || str4.isEmpty()) ? false : true;
        TextView textView = this.f4887;
        textView.setText(str4);
        textView.setVisibility(z ? 0 : 8);
        if (z) {
            string = C20196.m46451(string, " · ", str4);
        }
        this.f4875 = string;
        TextView textView2 = this.f4882;
        textView2.setText(str2);
        textView2.setVisibility(str2.isEmpty() ? 8 : 0);
        int[] iArr = C8082.f26737;
        int i5 = iArr[enumC4836.ordinal()];
        if (i5 == 1) {
            i = R.color.MT_Protector;
        } else if (i5 == 2) {
            i = R.color.MT_Protector;
        } else if (i5 == 3) {
            i = R.color.MT_Protector;
        } else {
            if (i5 != 4) {
                throw new IncompatibleClassChangeError();
            }
            i = R.color.MT_Protector;
        }
        int iM20558 = C7508.m20558(activityC9572, i);
        boolean z2 = enumC4836 == EnumC4836.RUNNING;
        this.f4890.setVisibility(z2 ? 0 : 8);
        int i6 = z2 ? 8 : 0;
        ImageView imageView = this.f4873;
        imageView.setVisibility(i6);
        int i7 = iArr[enumC4836.ordinal()];
        if (i7 == 1) {
            i2 = R.drawable.MT_Protector;
        } else if (i7 == 2) {
            i2 = R.drawable.MT_Protector;
        } else if (i7 == 3) {
            i2 = 0;
        } else {
            if (i7 != 4) {
                throw new IncompatibleClassChangeError();
            }
            i2 = R.drawable.MT_Protector;
        }
        imageView.setImageResource(i2);
        C12864.m31899(imageView, ColorStateList.valueOf(iM20558));
        boolean z3 = c14113.f44634 == activityC9572.f30974;
        this.f4885.setVisibility(z3 ? 0 : 8);
        this.f4879.setText(str5);
        this.f4884.setText(activityC9572.getString(R.string.MT_Protector, C22482.m50718(c14113.f44631)));
        int i8 = (!z3 || str.isEmpty()) ? 8 : 0;
        this.f4888.setVisibility(i8);
        TextView textView3 = this.f4877;
        textView3.setVisibility(i8);
        textView3.setText(str);
        if (c14113.m34264()) {
            string2 = activityC9572.getString(enumC4836 == EnumC4836.WAITING ? R.string.MT_Protector : R.string.MT_Protector);
        } else if (str3.isEmpty()) {
            string2 = activityC9572.getString(enumC4836 == EnumC4836.FAILED ? R.string.MT_Protector : R.string.MT_Protector);
        } else {
            string2 = str3;
        }
        boolean zM34264 = c14113.m34264();
        TextView textView4 = this.f4883;
        if (zM34264 || str3.isEmpty() || !str5.startsWith("mt_file_transfer_")) {
            textView4.setText(string2);
        } else {
            SpannableString spannableString = new SpannableString(string2);
            int iIndexOf = string2.indexOf(10);
            StyleSpan styleSpan = new StyleSpan(1);
            if (iIndexOf < 0) {
                iIndexOf = string2.length();
            }
            spannableString.setSpan(styleSpan, 0, iIndexOf, 33);
            textView4.setText(spannableString);
        }
        if (enumC4836 != EnumC4836.FAILED) {
            iM20558 = this.f4878;
        }
        textView4.setTextColor(iM20558);
        m5051(SystemClock.elapsedRealtime());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5051(long j) {
        long jMax;
        int i;
        String str;
        C14113 c14113 = this.f4880;
        EnumC4836 enumC4836 = c14113.f44628;
        EnumC4836 enumC4837 = EnumC4836.WAITING;
        if (enumC4836 == enumC4837) {
            jMax = c14113.m34263(j);
        } else {
            jMax = Math.max(0L, Math.max(0L, (c14113.m34264() ? j : c14113.f44626) - c14113.f44629) - c14113.m34263(j));
        }
        EnumC4836 enumC4838 = this.f4880.f44628;
        ActivityC9572 activityC9572 = this.f4889;
        String string = enumC4838 == enumC4837 ? activityC9572.getString(R.string.MT_Protector, ActivityC9572.m24996(activityC9572, jMax)) : ActivityC9572.m24996(activityC9572, jMax);
        TextView textView = this.f4881;
        textView.setText(string);
        int i2 = C8082.f26737[this.f4880.f44628.ordinal()];
        if (i2 == 1) {
            i = R.string.MT_Protector;
        } else if (i2 == 2) {
            i = R.string.MT_Protector;
        } else if (i2 == 3) {
            i = R.string.MT_Protector;
        } else {
            if (i2 != 4) {
                throw new IncompatibleClassChangeError();
            }
            i = R.string.MT_Protector;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4875);
        sb.append(", ");
        sb.append(activityC9572.getString(i));
        if (this.f4880.f44625.isEmpty()) {
            str = "";
        } else {
            str = ", " + this.f4880.f44625;
        }
        sb.append(str);
        sb.append(", ");
        sb.append((Object) textView.getText());
        this.f4876.setContentDescription(sb.toString());
        if (this.f4880.f44634 == activityC9572.f30974) {
            long jM34263 = this.f4880.m34263(j);
            C14113 c14114 = this.f4880;
            if (!c14114.m34264()) {
                j = c14114.f44626;
            }
            String string2 = activityC9572.getString(R.string.MT_Protector, ActivityC9572.m24996(activityC9572, Math.max(0L, j - c14114.f44629)));
            if (jM34263 > 0) {
                string2 = activityC9572.getString(R.string.MT_Protector, ActivityC9572.m24996(activityC9572, jM34263)) + " · " + string2;
            }
            this.f4874.setText(string2);
        }
    }
}
