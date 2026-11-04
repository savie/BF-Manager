package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.k;
import com.alipay.sdk.m.y.l;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۜᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7336 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ String m20137(JSONObject jSONObject, String str) {
        return m20109(R.string.MT_Protector, jSONObject, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:273:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:552:0x074f  */
    /* JADX WARN: Code duplicated, block: B:607:0x08ff  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20112(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        byte b;
        byte b2;
        int i;
        str.getClass();
        switch (str.hashCode()) {
            case -2123511115:
                if (str.equals("mt_file_create_directory")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1971780391:
                if (str.equals("mt_file_get_access_policy")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1888249149:
                if (str.equals("mt_apk_search")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1862022498:
                if (str.equals("mt_apk_dex_xref")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -1857179271:
                if (str.equals("mt_apk_patch_bytes")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1827097805:
                if (str.equals("mt_file_search")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1763539933:
                if (str.equals("mt_file_transfer_cancel")) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1647468000:
                if (str.equals("mt_apk_resource_edit")) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1647254348:
                if (str.equals("mt_apk_resource_list")) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -1647080020:
                if (str.equals("mt_apk_resource_read")) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -1646888655:
                if (str.equals("mt_apk_resource_xref")) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -1458504493:
                if (str.equals("mt_apk_native_disassemble")) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -1346956598:
                if (str.equals("mt_apk_list_entries")) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -1274719382:
                if (str.equals("mt_apk_read_signature")) {
                    b = cb.k;
                } else {
                    b = -1;
                }
                break;
            case -1174937436:
                if (str.equals("mt_file_delete_directory")) {
                    b = cb.f82047l;
                } else {
                    b = -1;
                }
                break;
            case -1132361204:
                if (str.equals("mt_apk_native_list_items")) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case -1070178551:
                if (str.equals("mt_file_patch_bytes")) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -992889017:
                if (str.equals("mt_apk_edit_text")) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -982194168:
                if (str.equals("mt_apk_native_xref")) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case -907410957:
                if (str.equals("mt_apk_build")) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -894221867:
                if (str.equals("mt_apk_native_patch_string")) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -467411567:
                if (str.equals("mt_apk_dex_read_pseudocode")) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case -462719868:
                if (str.equals("mt_apk_native_map_address")) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case -308599703:
                if (str.equals("mt_apk_native_patch_instructions")) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -299333417:
                if (str.equals("mt_file_edit_text")) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -283853312:
                if (str.equals("mt_zip_read_text")) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case -240311493:
                if (str.equals("mt_apk_read_text")) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -225549832:
                if (str.equals("mt_zip_read_bytes")) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -224001040:
                if (str.equals("mt_apk_workspace_delete")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                } else {
                    b = -1;
                }
                break;
            case -207074976:
                if (str.equals("mt_file_write_bytes")) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case -22322168:
                if (str.equals("mt_apk_dex_list_classes")) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case 250516771:
                if (str.equals("mt_file_replace_text")) {
                    b = bo.j;
                } else {
                    b = -1;
                }
                break;
            case 317338069:
                if (str.equals("mt_apk_dex_read_class_outline")) {
                    b = UTF8.S_CS3;
                } else {
                    b = -1;
                }
                break;
            case 341208724:
                if (str.equals("mt_zip_list")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                } else {
                    b = -1;
                }
                break;
            case 341443208:
                if (str.equals("mt_zip_test")) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case 386458560:
                if (str.equals("mt_file_copy")) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case 386721001:
                if (str.equals("mt_file_list")) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case 386756636:
                if (str.equals("mt_file_move")) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case 386939551:
                if (str.equals("mt_file_stat")) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 408889875:
                if (str.equals("mt_apk_list_available_apks")) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case 453244107:
                if (str.equals("mt_file_read_text")) {
                    b = 40;
                } else {
                    b = -1;
                }
                break;
            case 462356615:
                if (str.equals("mt_file_append_text")) {
                    b = 41;
                } else {
                    b = -1;
                }
                break;
            case 505070749:
                if (str.equals("mt_apk_list_installed_apps")) {
                    b = 42;
                } else {
                    b = -1;
                }
                break;
            case 536886279:
                if (str.equals("mt_apk_native_inspect")) {
                    b = 43;
                } else {
                    b = -1;
                }
                break;
            case 707888898:
                if (str.equals("mt_apk_continue")) {
                    b = 44;
                } else {
                    b = -1;
                }
                break;
            case 714809027:
                if (str.equals("mt_apk_copy_entry")) {
                    b = 45;
                } else {
                    b = -1;
                }
                break;
            case 769908445:
                if (str.equals("mt_file_truncate_bytes")) {
                    b = 46;
                } else {
                    b = -1;
                }
                break;
            case 778136011:
                if (str.equals("mt_apk_resource_add")) {
                    b = 47;
                } else {
                    b = -1;
                }
                break;
            case 978779171:
                if (str.equals("mt_apk_workspace_list")) {
                    b = UTF8.S_P3A;
                } else {
                    b = -1;
                }
                break;
            case 978874831:
                if (str.equals("mt_apk_workspace_open")) {
                    b = 49;
                } else {
                    b = -1;
                }
                break;
            case 1011302619:
                if (str.equals("mt_file_transfer_create_upload")) {
                    b = 50;
                } else {
                    b = -1;
                }
                break;
            case 1063038178:
                if (str.equals("mt_file_transfer_create_download")) {
                    b = 51;
                } else {
                    b = -1;
                }
                break;
            case 1124246557:
                if (str.equals("mt_apk_read_bytes")) {
                    b = 52;
                } else {
                    b = -1;
                }
                break;
            case 1149633677:
                if (str.equals("mt_file_read_bytes")) {
                    b = 53;
                } else {
                    b = -1;
                }
                break;
            case 1234286962:
                if (str.equals("mt_zip_create")) {
                    b = 54;
                } else {
                    b = -1;
                }
                break;
            case 1314084816:
                if (str.equals("mt_apk_native_analyze_control_flow")) {
                    b = 55;
                } else {
                    b = -1;
                }
                break;
            case 1432121425:
                if (str.equals("mt_file_append_bytes")) {
                    b = 56;
                } else {
                    b = -1;
                }
                break;
            case 1569313483:
                if (str.equals("mt_zip_extract")) {
                    b = 57;
                } else {
                    b = -1;
                }
                break;
            case 1583059936:
                if (str.equals("mt_apk_install")) {
                    b = 58;
                } else {
                    b = -1;
                }
                break;
            case 1598557249:
                if (str.equals("mt_apk_resource_delete")) {
                    b = 59;
                } else {
                    b = -1;
                }
                break;
            case 1626482986:
                if (str.equals("mt_apk_delete_target")) {
                    b = 60;
                } else {
                    b = -1;
                }
                break;
            case 1642795232:
                if (str.equals("mt_apk_session_create")) {
                    b = Base32Encoder.DEFAULT_PADDING;
                } else {
                    b = -1;
                }
                break;
            case 1747734847:
                if (str.equals("mt_zip_update")) {
                    b = 62;
                } else {
                    b = -1;
                }
                break;
            case 1809273529:
                if (str.equals("mt_file_search_text")) {
                    b = 63;
                } else {
                    b = -1;
                }
                break;
            case 1853810852:
                if (str.equals("mt_apk_session_check")) {
                    b = 64;
                } else {
                    b = -1;
                }
                break;
            case 1941193293:
                if (str.equals("mt_file_transfer_get")) {
                    b = 65;
                } else {
                    b = -1;
                }
                break;
            case 2038747958:
                if (str.equals("mt_file_delete")) {
                    b = 66;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                JSONObject jSONObjectM20135 = m20135(jSONObject2);
                JSONObject jSONObjectM20142 = m20142(jSONObjectM20135, d.O);
                if (!jSONObjectM20142.isEmpty()) {
                    return m20109(0, jSONObjectM20142, str);
                }
                JSONObject jSONObjectM20143 = m20142(jSONObjectM20135, e.m);
                C2861 c2861 = new C2861(4096);
                switch (str.hashCode()) {
                    case -2123511115:
                        if (str.equals("mt_file_create_directory")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1971780391:
                        if (str.equals("mt_file_get_access_policy")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1888249149:
                        if (str.equals("mt_apk_search")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1862022498:
                        if (str.equals("mt_apk_dex_xref")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1857179271:
                        if (str.equals("mt_apk_patch_bytes")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1827097805:
                        if (str.equals("mt_file_search")) {
                            b2 = 5;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1763539933:
                        if (str.equals("mt_file_transfer_cancel")) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1647468000:
                        if (str.equals("mt_apk_resource_edit")) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1647254348:
                        if (str.equals("mt_apk_resource_list")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1647080020:
                        if (str.equals("mt_apk_resource_read")) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1646888655:
                        if (str.equals("mt_apk_resource_xref")) {
                            b2 = 10;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1458504493:
                        if (str.equals("mt_apk_native_disassemble")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1346956598:
                        if (str.equals("mt_apk_list_entries")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1274719382:
                        if (str.equals("mt_apk_read_signature")) {
                            b2 = cb.k;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1174937436:
                        if (str.equals("mt_file_delete_directory")) {
                            b2 = cb.f82047l;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1132361204:
                        if (str.equals("mt_apk_native_list_items")) {
                            b2 = 15;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1070178551:
                        if (str.equals("mt_file_patch_bytes")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -992889017:
                        if (str.equals("mt_apk_edit_text")) {
                            b2 = 17;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -982194168:
                        if (str.equals("mt_apk_native_xref")) {
                            b2 = 18;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -907410957:
                        if (str.equals("mt_apk_build")) {
                            b2 = 19;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -894221867:
                        if (str.equals("mt_apk_native_patch_string")) {
                            b2 = 20;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -467411567:
                        if (str.equals("mt_apk_dex_read_pseudocode")) {
                            b2 = 21;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -462719868:
                        if (str.equals("mt_apk_native_map_address")) {
                            b2 = 22;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -308599703:
                        if (str.equals("mt_apk_native_patch_instructions")) {
                            b2 = 23;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -299333417:
                        if (str.equals("mt_file_edit_text")) {
                            b2 = 24;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -283853312:
                        if (str.equals("mt_zip_read_text")) {
                            b2 = 25;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -240311493:
                        if (str.equals("mt_apk_read_text")) {
                            b2 = 26;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -225549832:
                        if (str.equals("mt_zip_read_bytes")) {
                            b2 = 27;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -224001040:
                        if (str.equals("mt_apk_workspace_delete")) {
                            b2 = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -207074976:
                        if (str.equals("mt_file_write_bytes")) {
                            b2 = 29;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -22322168:
                        if (str.equals("mt_apk_dex_list_classes")) {
                            b2 = 30;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 250516771:
                        if (str.equals("mt_file_replace_text")) {
                            b2 = bo.j;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 317338069:
                        if (str.equals("mt_apk_dex_read_class_outline")) {
                            b2 = UTF8.S_CS3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 341208724:
                        if (str.equals("mt_zip_list")) {
                            b2 = PublicSuffixDatabase.EXCEPTION_MARKER;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 341443208:
                        if (str.equals("mt_zip_test")) {
                            b2 = 34;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386458560:
                        if (str.equals("mt_file_copy")) {
                            b2 = 35;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386721001:
                        if (str.equals("mt_file_list")) {
                            b2 = 36;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386756636:
                        if (str.equals("mt_file_move")) {
                            b2 = 37;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386939551:
                        if (str.equals("mt_file_stat")) {
                            b2 = 38;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 408889875:
                        if (str.equals("mt_apk_list_available_apks")) {
                            b2 = 39;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 453244107:
                        if (str.equals("mt_file_read_text")) {
                            b2 = 40;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 462356615:
                        if (str.equals("mt_file_append_text")) {
                            b2 = 41;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 505070749:
                        if (str.equals("mt_apk_list_installed_apps")) {
                            b2 = 42;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 536886279:
                        if (str.equals("mt_apk_native_inspect")) {
                            b2 = 43;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 707888898:
                        if (str.equals("mt_apk_continue")) {
                            b2 = 44;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 714809027:
                        if (str.equals("mt_apk_copy_entry")) {
                            b2 = 45;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 769908445:
                        if (str.equals("mt_file_truncate_bytes")) {
                            b2 = 46;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 778136011:
                        if (str.equals("mt_apk_resource_add")) {
                            b2 = 47;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 978779171:
                        if (str.equals("mt_apk_workspace_list")) {
                            b2 = UTF8.S_P3A;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 978874831:
                        if (str.equals("mt_apk_workspace_open")) {
                            b2 = 49;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1011302619:
                        if (str.equals("mt_file_transfer_create_upload")) {
                            b2 = 50;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1063038178:
                        if (str.equals("mt_file_transfer_create_download")) {
                            b2 = 51;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1124246557:
                        if (str.equals("mt_apk_read_bytes")) {
                            b2 = 52;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1149633677:
                        if (str.equals("mt_file_read_bytes")) {
                            b2 = 53;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1234286962:
                        if (str.equals("mt_zip_create")) {
                            b2 = 54;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1314084816:
                        if (str.equals("mt_apk_native_analyze_control_flow")) {
                            b2 = 55;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1432121425:
                        if (str.equals("mt_file_append_bytes")) {
                            b2 = 56;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1569313483:
                        if (str.equals("mt_zip_extract")) {
                            b2 = 57;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1583059936:
                        if (str.equals("mt_apk_install")) {
                            b2 = 58;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1598557249:
                        if (str.equals("mt_apk_resource_delete")) {
                            b2 = 59;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1626482986:
                        if (str.equals("mt_apk_delete_target")) {
                            b2 = 60;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1642795232:
                        if (str.equals("mt_apk_session_create")) {
                            b2 = Base32Encoder.DEFAULT_PADDING;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1747734847:
                        if (str.equals("mt_zip_update")) {
                            b2 = 62;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1809273529:
                        if (str.equals("mt_file_search_text")) {
                            b2 = 63;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1853810852:
                        if (str.equals("mt_apk_session_check")) {
                            b2 = 64;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1941193293:
                        if (str.equals("mt_file_transfer_get")) {
                            b2 = 65;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 2038747958:
                        if (str.equals("mt_file_delete")) {
                            b2 = 66;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        c2861.m9424(m20104(jSONObjectM20143, "changed") ? R.string.MT_Protector : R.string.MT_Protector, new Object[0]);
                        break;
                    case 1:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "homePath");
                        JSONArray jSONArrayM20123 = m20123(jSONObjectM20143, "rules");
                        for (int i2 = 0; i2 < Math.min(3, jSONArrayM20123.size()); i2++) {
                            JSONObject jSONObjectM20134 = m20134(jSONArrayM20123, i2);
                            String strM20139 = m20139(C4967.m15167(jSONObjectM20134, MotionUtils.EASING_TYPE_PATH), ": ", m20119(C4967.m15167(jSONObjectM20134, am.Q)));
                            if (m20104(jSONObjectM20134, "active")) {
                                strM20139 = C21576.m49059(R.string.MT_Protector, strM20139);
                            }
                            c2861.m9448(strM20139);
                        }
                        c2861.m9421(jSONArrayM20123.size());
                        break;
                    case 2:
                    case 3:
                    case 8:
                    case 10:
                    case 12:
                    case 15:
                    case 18:
                    case 30:
                    case 39:
                    case 48:
                        c2861.m9432(jSONObjectM20143, EnumC8827.NONE);
                        break;
                    case 4:
                        c2861.m9427(jSONObjectM20143);
                        break;
                    case 5:
                    case 36:
                        c2861.m9432(jSONObjectM20143, EnumC8827.FILE);
                        break;
                    case 6:
                    case 50:
                    case 51:
                    case 65:
                        c2861.m9446(jSONObjectM20143, str);
                        break;
                    case 7:
                        c2861.m9419(jSONObjectM20143);
                        break;
                    case 9:
                        JSONArray jSONArrayM20124 = m20123(jSONObjectM20143, "results");
                        c2861.m9424(R.string.MT_Protector, Integer.valueOf(jSONArrayM20124.size()));
                        for (int i3 = 0; i3 < Math.min(3, jSONArrayM20124.size()); i3++) {
                            JSONObject jSONObjectM20136 = m20134(jSONArrayM20124, i3);
                            c2861.m9438("");
                            String strM15167 = C4967.m15167(jSONObjectM20136, "name");
                            String strM20138 = strM15167.isEmpty() ? m20138(C4967.m15167(jSONObjectM20136, "locator")) : m20139(C4967.m15167(jSONObjectM20136, "type"), "/", strM15167);
                            if (!strM20138.isEmpty()) {
                                c2861.m9443(R.string.MT_Protector, strM20138);
                            }
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20136, "variant");
                            if (C4967.m15167(jSONObjectM20136, "errorCode").isEmpty()) {
                                JSONValue jSONValue = jSONObjectM20136.get("valueXml");
                                JSONValue jSONValue2 = jSONObjectM20136.get(b.d);
                                if (jSONValue != null && jSONValue.isString()) {
                                    c2861.m9434(jSONValue.asString());
                                } else if (jSONValue2 == null || !jSONValue2.isString()) {
                                    c2861.m9444(m20123(jSONObjectM20136, "items"));
                                } else {
                                    c2861.m9434(jSONValue2.asString());
                                }
                                if (m20121(jSONObjectM20136, "valueTruncated") || m20121(jSONObjectM20136, "valueXmlTruncated") || m20121(jSONObjectM20136, "itemsTruncated")) {
                                    c2861.m9420();
                                }
                            } else {
                                c2861.m9448(m20109(0, jSONObjectM20136, str));
                            }
                        }
                        c2861.m9421(jSONArrayM20124.size());
                        break;
                    case 11:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "instructionCount");
                        JSONValue jSONValue3 = jSONObjectM20143.get("disassemblyText");
                        if (jSONValue3 != null && jSONValue3.isString()) {
                            c2861.m9434(jSONValue3.asString());
                        }
                        c2861.m9435(jSONObjectM20143);
                        break;
                    case 13:
                        JSONObject jSONObjectM20144 = m20142(jSONObjectM20143, "signature");
                        c2861.m9424(m20121(jSONObjectM20144, "available") ? m20121(jSONObjectM20144, "signaturePresent") ? R.string.MT_Protector : R.string.MT_Protector : R.string.MT_Protector, new Object[0]);
                        c2861.m9426(m20123(jSONObjectM20144, "schemes"), R.string.MT_Protector);
                        JSONArray jSONArrayM20125 = m20123(jSONObjectM20144, "certificates");
                        for (int i4 = 0; i4 < Math.min(3, jSONArrayM20125.size()); i4++) {
                            JSONObject jSONObjectM20137 = m20134(jSONArrayM20125, i4);
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20137, "subject");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20137, "sha256");
                        }
                        break;
                    case 14:
                        c2861.m9424(R.string.MT_Protector, new Object[0]);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "deletedFiles");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "deletedDirectories");
                        break;
                    case 16:
                    case 20:
                    case 23:
                        if (m20104(jSONObjectM20143, "changed")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        } else {
                            c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20143, "bytesPatched", 0L)));
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "beforeHex");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "afterHex");
                        break;
                    case 17:
                        String strM15168 = C4967.m15167(jSONObjectM20143, "editSessionId");
                        if (strM15168.isEmpty()) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        } else {
                            c2861.m9443(R.string.MT_Protector, strM15168);
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "locator");
                        break;
                    case 19:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "outputPath");
                        c2861.m9449(jSONObjectM20143);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "signingPerformed");
                        break;
                    case 21:
                        c2861.m9433(jSONObjectM20143, false);
                        break;
                    case 22:
                        if (m20104(jSONObjectM20143, "found")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        } else {
                            JSONObject jSONObjectM20145 = m20142(jSONObjectM20143, "mapping");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20145, "fileOffset");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20145, "sectionName");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20145, "isLoaded");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20145, "isExecutable");
                        }
                        break;
                    case 24:
                    case 29:
                    case 31:
                    case 41:
                    case 46:
                    case 56:
                        if (m20104(jSONObjectM20143, "changed")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "replacements");
                        c2861.m9449(jSONObjectM20143);
                        break;
                    case 25:
                    case 40:
                        c2861.m9433(jSONObjectM20143, true);
                        break;
                    case 26:
                        c2861.m9433(jSONObjectM20143, !m20130(C4967.m15167(jSONObject, "locator")).equals("axml"));
                        break;
                    case 27:
                    case 52:
                    case 53:
                        c2861.m9437(jSONObjectM20143);
                        break;
                    case 28:
                        c2861.m9424(m20104(jSONObjectM20143, "deleted") ? R.string.MT_Protector : R.string.MT_Protector, new Object[0]);
                        break;
                    case 32:
                        c2861.m9440(jSONObjectM20143);
                        break;
                    case 33:
                        c2861.m9432(jSONObjectM20143, m20121(jSONObject, "simple") ? EnumC8827.NONE : EnumC8827.ZIP);
                        break;
                    case 34:
                        c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20143, "checkedEntries", 0L)));
                        break;
                    case 35:
                    case 37:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        if (m20104(jSONObjectM20143, "changed")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "destinationPath");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "localPath");
                        c2861.m9449(jSONObjectM20143);
                        break;
                    case 38:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "type");
                        c2861.m9449(jSONObjectM20143);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, am.Q);
                        break;
                    case 42:
                        c2861.m9441(jSONObjectM20143);
                        break;
                    case 43:
                        c2861.m9448(m20139(C4967.m15167(jSONObjectM20143, "type"), " · ", C4967.m15167(jSONObjectM20143, "arch")));
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "archBits");
                        c2861.m9422(R.string.MT_Protector, m20142(jSONObjectM20143, "counts"), "symbols");
                        c2861.m9422(R.string.MT_Protector, m20142(jSONObjectM20143, "counts"), "sections");
                        break;
                    case 44:
                        if (!C4967.m15167(jSONObjectM20143, "appType").isEmpty()) {
                            c2861.m9441(jSONObjectM20143);
                        } else if (!m20142(jSONObjectM20143, "textWindow").isEmpty()) {
                            String strM15169 = C4967.m15167(jSONObjectM20143, "style");
                            c2861.m9433(jSONObjectM20143, (strM15169.equals("readable") || strM15169.equals("instruction") || m20130(C4967.m15167(jSONObjectM20143, "locator")).equals("axml")) ? false : true);
                        } else if (!m20142(jSONObjectM20143, "byteWindow").isEmpty()) {
                            c2861.m9437(jSONObjectM20143);
                        } else if (jSONObjectM20143.getJSONArray("fields") == null || jSONObjectM20143.getJSONArray("methods") == null) {
                            c2861.m9432(jSONObjectM20143, EnumC8827.NONE);
                        } else {
                            c2861.m9440(jSONObjectM20143);
                        }
                        break;
                    case 47:
                        c2861.m9429(jSONObject, jSONObjectM20143);
                        c2861.m9425(m20123(jSONObjectM20143, "results"));
                        break;
                    case 49:
                        c2861.m9422(R.string.mcp_log_l_workspace_id, jSONObjectM20143, "workspaceId");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "appLabel");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "packageName");
                        long jM20133 = m20133(m20142(jSONObjectM20143, "installedApp"), "splitCount", 0L);
                        if (jM20133 > 0) {
                            c2861.m9424(R.string.MT_Protector, Long.valueOf(jM20133));
                        }
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case 62:
                        if (m20104(jSONObjectM20143, "changed")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9449(jSONObjectM20143);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        JSONObject jSONObjectM20146 = m20142(jSONObjectM20143, "observedGraphSummary");
                        c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20146, "blockCount", 0L)), Long.valueOf(m20133(jSONObjectM20146, "edgeCount", 0L)));
                        c2861.m9422(R.string.MT_Protector, m20142(jSONObjectM20143, "function"), "startVirtualAddress");
                        break;
                    case 57:
                        c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20143, "completedFiles", 0L)));
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20143, "createdDirectories");
                        break;
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        String strM151610 = C4967.m15167(jSONObjectM20143, c.a);
                        strM151610.getClass();
                        switch (strM151610) {
                            case "user_action_required":
                                i = R.string.MT_Protector;
                                break;
                            case "started":
                                i = R.string.MT_Protector;
                                break;
                            case "failed":
                                i = R.string.MT_Protector;
                                break;
                            case "installed":
                                i = R.string.MT_Protector;
                                break;
                            default:
                                i = R.string.MT_Protector;
                                break;
                        }
                        c2861.m9424(i, new Object[0]);
                        if (strM151610.equals(k.j)) {
                            c2861.m9448(C4967.m15167(jSONObjectM20143, "message"));
                        }
                        if (strM151610.equals("started")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        }
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                        c2861.m9416(R.string.MT_Protector, jSONObjectM20143, "deletedResourceCount");
                        if (m20111(m20123(jSONObject, "deletes")).equals("type_variant")) {
                            c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20143, "deletedTypeVariantCount", 0L)), Long.valueOf(m20133(jSONObjectM20143, "deletedValueCount", 0L)));
                        } else {
                            c2861.m9416(R.string.MT_Protector, jSONObjectM20143, "deletedValueCount");
                            c2861.m9416(R.string.MT_Protector, jSONObjectM20143, "deletedTypeVariantCount");
                        }
                        break;
                    case 60:
                        c2861.m9424(m20104(jSONObjectM20143, "deleted") ? R.string.MT_Protector : R.string.MT_Protector, new Object[0]);
                        break;
                    case 61:
                        c2861.m9422(R.string.mcp_log_l_session_id, jSONObjectM20143, "editSessionId");
                        break;
                    case 63:
                        c2861.m9424(R.string.MT_Protector, Integer.valueOf(m20123(jSONObjectM20143, "matchedLines").size()));
                        JSONArray jSONArrayM20126 = m20123(jSONObjectM20143, "blocks");
                        for (int i5 = 0; i5 < Math.min(3, jSONArrayM20126.size()); i5++) {
                            JSONObject jSONObjectM20138 = m20134(jSONArrayM20126, i5);
                            c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20138, "startLine", 0L) + 1));
                            JSONValue jSONValue4 = jSONObjectM20138.get(TextBundle.TEXT_ENTRY);
                            if (jSONValue4 != null && jSONValue4.isString()) {
                                c2861.m9434(jSONValue4.asString());
                            }
                        }
                        String strM151611 = C4967.m15167(jSONObjectM20143, "stopReason");
                        if (strM151611.equals(d.aB)) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        } else if (!strM151611.equals("resource_limit") && !strM151611.equals("decode_error")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        }
                        break;
                    case 64:
                        if (C4967.m15167(jSONObjectM20143, "buildCheckStatus").equals("passed")) {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                        } else {
                            c2861.m9424(R.string.MT_Protector, new Object[0]);
                            c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20143, "pendingCompileCount", 0L)));
                            c2861.m9424(R.string.MT_Protector, Long.valueOf(m20133(jSONObjectM20143, "failedCount", 0L)));
                        }
                        break;
                    case 66:
                        c2861.m9424(R.string.MT_Protector, new Object[0]);
                        break;
                }
                if (str.equals("mt_file_search")) {
                    c2861.m9436(m20123(jSONObjectM20143, "warnings"));
                }
                return c2861.toString();
            default:
                return C4967.m15172(jSONObject2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:273:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:557:0x075e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m20124(JSONObject jSONObject, String str) {
        byte b;
        byte b2;
        String str2;
        String str3;
        String str4;
        str.getClass();
        switch (str.hashCode()) {
            case -2123511115:
                if (str.equals("mt_file_create_directory")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1971780391:
                if (str.equals("mt_file_get_access_policy")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1888249149:
                if (str.equals("mt_apk_search")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1862022498:
                if (str.equals("mt_apk_dex_xref")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -1857179271:
                if (str.equals("mt_apk_patch_bytes")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1827097805:
                if (str.equals("mt_file_search")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1763539933:
                if (str.equals("mt_file_transfer_cancel")) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1647468000:
                if (str.equals("mt_apk_resource_edit")) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1647254348:
                if (str.equals("mt_apk_resource_list")) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -1647080020:
                if (str.equals("mt_apk_resource_read")) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -1646888655:
                if (str.equals("mt_apk_resource_xref")) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -1458504493:
                if (str.equals("mt_apk_native_disassemble")) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -1346956598:
                if (str.equals("mt_apk_list_entries")) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -1274719382:
                if (str.equals("mt_apk_read_signature")) {
                    b = cb.k;
                } else {
                    b = -1;
                }
                break;
            case -1174937436:
                if (str.equals("mt_file_delete_directory")) {
                    b = cb.f82047l;
                } else {
                    b = -1;
                }
                break;
            case -1132361204:
                if (str.equals("mt_apk_native_list_items")) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case -1070178551:
                if (str.equals("mt_file_patch_bytes")) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -992889017:
                if (str.equals("mt_apk_edit_text")) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -982194168:
                if (str.equals("mt_apk_native_xref")) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case -907410957:
                if (str.equals("mt_apk_build")) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -894221867:
                if (str.equals("mt_apk_native_patch_string")) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -467411567:
                if (str.equals("mt_apk_dex_read_pseudocode")) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case -462719868:
                if (str.equals("mt_apk_native_map_address")) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case -308599703:
                if (str.equals("mt_apk_native_patch_instructions")) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -299333417:
                if (str.equals("mt_file_edit_text")) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -283853312:
                if (str.equals("mt_zip_read_text")) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case -240311493:
                if (str.equals("mt_apk_read_text")) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -225549832:
                if (str.equals("mt_zip_read_bytes")) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -224001040:
                if (str.equals("mt_apk_workspace_delete")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                } else {
                    b = -1;
                }
                break;
            case -207074976:
                if (str.equals("mt_file_write_bytes")) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case -22322168:
                if (str.equals("mt_apk_dex_list_classes")) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case 250516771:
                if (str.equals("mt_file_replace_text")) {
                    b = bo.j;
                } else {
                    b = -1;
                }
                break;
            case 317338069:
                if (str.equals("mt_apk_dex_read_class_outline")) {
                    b = UTF8.S_CS3;
                } else {
                    b = -1;
                }
                break;
            case 341208724:
                if (str.equals("mt_zip_list")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                } else {
                    b = -1;
                }
                break;
            case 341443208:
                if (str.equals("mt_zip_test")) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case 386458560:
                if (str.equals("mt_file_copy")) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case 386721001:
                if (str.equals("mt_file_list")) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case 386756636:
                if (str.equals("mt_file_move")) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case 386939551:
                if (str.equals("mt_file_stat")) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 408889875:
                if (str.equals("mt_apk_list_available_apks")) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case 453244107:
                if (str.equals("mt_file_read_text")) {
                    b = 40;
                } else {
                    b = -1;
                }
                break;
            case 462356615:
                if (str.equals("mt_file_append_text")) {
                    b = 41;
                } else {
                    b = -1;
                }
                break;
            case 505070749:
                if (str.equals("mt_apk_list_installed_apps")) {
                    b = 42;
                } else {
                    b = -1;
                }
                break;
            case 536886279:
                if (str.equals("mt_apk_native_inspect")) {
                    b = 43;
                } else {
                    b = -1;
                }
                break;
            case 707888898:
                if (str.equals("mt_apk_continue")) {
                    b = 44;
                } else {
                    b = -1;
                }
                break;
            case 714809027:
                if (str.equals("mt_apk_copy_entry")) {
                    b = 45;
                } else {
                    b = -1;
                }
                break;
            case 769908445:
                if (str.equals("mt_file_truncate_bytes")) {
                    b = 46;
                } else {
                    b = -1;
                }
                break;
            case 778136011:
                if (str.equals("mt_apk_resource_add")) {
                    b = 47;
                } else {
                    b = -1;
                }
                break;
            case 978779171:
                if (str.equals("mt_apk_workspace_list")) {
                    b = UTF8.S_P3A;
                } else {
                    b = -1;
                }
                break;
            case 978874831:
                if (str.equals("mt_apk_workspace_open")) {
                    b = 49;
                } else {
                    b = -1;
                }
                break;
            case 1011302619:
                if (str.equals("mt_file_transfer_create_upload")) {
                    b = 50;
                } else {
                    b = -1;
                }
                break;
            case 1063038178:
                if (str.equals("mt_file_transfer_create_download")) {
                    b = 51;
                } else {
                    b = -1;
                }
                break;
            case 1124246557:
                if (str.equals("mt_apk_read_bytes")) {
                    b = 52;
                } else {
                    b = -1;
                }
                break;
            case 1149633677:
                if (str.equals("mt_file_read_bytes")) {
                    b = 53;
                } else {
                    b = -1;
                }
                break;
            case 1234286962:
                if (str.equals("mt_zip_create")) {
                    b = 54;
                } else {
                    b = -1;
                }
                break;
            case 1314084816:
                if (str.equals("mt_apk_native_analyze_control_flow")) {
                    b = 55;
                } else {
                    b = -1;
                }
                break;
            case 1432121425:
                if (str.equals("mt_file_append_bytes")) {
                    b = 56;
                } else {
                    b = -1;
                }
                break;
            case 1569313483:
                if (str.equals("mt_zip_extract")) {
                    b = 57;
                } else {
                    b = -1;
                }
                break;
            case 1583059936:
                if (str.equals("mt_apk_install")) {
                    b = 58;
                } else {
                    b = -1;
                }
                break;
            case 1598557249:
                if (str.equals("mt_apk_resource_delete")) {
                    b = 59;
                } else {
                    b = -1;
                }
                break;
            case 1626482986:
                if (str.equals("mt_apk_delete_target")) {
                    b = 60;
                } else {
                    b = -1;
                }
                break;
            case 1642795232:
                if (str.equals("mt_apk_session_create")) {
                    b = Base32Encoder.DEFAULT_PADDING;
                } else {
                    b = -1;
                }
                break;
            case 1747734847:
                if (str.equals("mt_zip_update")) {
                    b = 62;
                } else {
                    b = -1;
                }
                break;
            case 1809273529:
                if (str.equals("mt_file_search_text")) {
                    b = 63;
                } else {
                    b = -1;
                }
                break;
            case 1853810852:
                if (str.equals("mt_apk_session_check")) {
                    b = 64;
                } else {
                    b = -1;
                }
                break;
            case 1941193293:
                if (str.equals("mt_file_transfer_get")) {
                    b = 65;
                } else {
                    b = -1;
                }
                break;
            case 2038747958:
                if (str.equals("mt_file_delete")) {
                    b = 66;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                if (str.equals("mt_apk_workspace_list") || str.equals("mt_file_get_access_policy")) {
                    return "";
                }
                C2861 c2861 = new C2861(2048);
                boolean z = jSONObject.size() > 40;
                JSONObject jSONObjectM20135 = m20135(jSONObject);
                boolean z2 = z;
                int iM20117 = m20117(jSONObjectM20135, str);
                String str5 = "";
                if (iM20117 > 1) {
                    c2861.m9424(iM20117 > 3 ? R.string.MT_Protector : R.string.MT_Protector, Integer.valueOf(iM20117));
                }
                switch (str) {
                    case "mt_file_create_directory":
                        b2 = 0;
                        break;
                    case "mt_apk_search":
                        b2 = 1;
                        break;
                    case "mt_apk_dex_xref":
                        b2 = 2;
                        break;
                    case "mt_apk_patch_bytes":
                        b2 = 3;
                        break;
                    case "mt_file_search":
                        b2 = 4;
                        break;
                    case "mt_file_transfer_cancel":
                        b2 = 5;
                        break;
                    case "mt_apk_resource_edit":
                        b2 = 6;
                        break;
                    case "mt_apk_resource_list":
                        b2 = 7;
                        break;
                    case "mt_apk_resource_read":
                        b2 = 8;
                        break;
                    case "mt_apk_resource_xref":
                        b2 = 9;
                        break;
                    case "mt_apk_native_disassemble":
                        b2 = 10;
                        break;
                    case "mt_apk_list_entries":
                        b2 = 11;
                        break;
                    case "mt_apk_read_signature":
                        b2 = 12;
                        break;
                    case "mt_file_delete_directory":
                        b2 = cb.k;
                        break;
                    case "mt_apk_native_list_items":
                        b2 = cb.f82047l;
                        break;
                    case "mt_file_patch_bytes":
                        b2 = 15;
                        break;
                    case "mt_apk_edit_text":
                        b2 = 16;
                        break;
                    case "mt_apk_native_xref":
                        b2 = 17;
                        break;
                    case "mt_apk_build":
                        b2 = 18;
                        break;
                    case "mt_apk_native_patch_string":
                        b2 = 19;
                        break;
                    case "mt_apk_dex_read_pseudocode":
                        b2 = 20;
                        break;
                    case "mt_apk_native_map_address":
                        b2 = 21;
                        break;
                    case "mt_apk_native_patch_instructions":
                        b2 = 22;
                        break;
                    case "mt_file_edit_text":
                        b2 = 23;
                        break;
                    case "mt_zip_read_text":
                        b2 = 24;
                        break;
                    case "mt_apk_read_text":
                        b2 = 25;
                        break;
                    case "mt_zip_read_bytes":
                        b2 = 26;
                        break;
                    case "mt_apk_workspace_delete":
                        b2 = 27;
                        break;
                    case "mt_file_write_bytes":
                        b2 = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        break;
                    case "mt_apk_dex_list_classes":
                        b2 = 29;
                        break;
                    case "mt_file_replace_text":
                        b2 = 30;
                        break;
                    case "mt_apk_dex_read_class_outline":
                        b2 = bo.j;
                        break;
                    case "mt_zip_list":
                        b2 = UTF8.S_CS3;
                        break;
                    case "mt_zip_test":
                        b2 = PublicSuffixDatabase.EXCEPTION_MARKER;
                        break;
                    case "mt_file_copy":
                        b2 = 34;
                        break;
                    case "mt_file_list":
                        b2 = 35;
                        break;
                    case "mt_file_move":
                        b2 = 36;
                        break;
                    case "mt_file_stat":
                        b2 = 37;
                        break;
                    case "mt_apk_list_available_apks":
                        b2 = 38;
                        break;
                    case "mt_file_read_text":
                        b2 = 39;
                        break;
                    case "mt_file_append_text":
                        b2 = 40;
                        break;
                    case "mt_apk_list_installed_apps":
                        b2 = 41;
                        break;
                    case "mt_apk_native_inspect":
                        b2 = 42;
                        break;
                    case "mt_apk_continue":
                        b2 = 43;
                        break;
                    case "mt_apk_copy_entry":
                        b2 = 44;
                        break;
                    case "mt_file_truncate_bytes":
                        b2 = 45;
                        break;
                    case "mt_apk_resource_add":
                        b2 = 46;
                        break;
                    case "mt_apk_workspace_open":
                        b2 = 47;
                        break;
                    case "mt_file_transfer_create_upload":
                        b2 = UTF8.S_P3A;
                        break;
                    case "mt_file_transfer_create_download":
                        b2 = 49;
                        break;
                    case "mt_apk_read_bytes":
                        b2 = 50;
                        break;
                    case "mt_file_read_bytes":
                        b2 = 51;
                        break;
                    case "mt_zip_create":
                        b2 = 52;
                        break;
                    case "mt_apk_native_analyze_control_flow":
                        b2 = 53;
                        break;
                    case "mt_file_append_bytes":
                        b2 = 54;
                        break;
                    case "mt_zip_extract":
                        b2 = 55;
                        break;
                    case "mt_apk_install":
                        b2 = 56;
                        break;
                    case "mt_apk_resource_delete":
                        b2 = 57;
                        break;
                    case "mt_apk_delete_target":
                        b2 = 58;
                        break;
                    case "mt_apk_session_create":
                        b2 = 59;
                        break;
                    case "mt_zip_update":
                        b2 = 60;
                        break;
                    case "mt_file_search_text":
                        b2 = Base32Encoder.DEFAULT_PADDING;
                        break;
                    case "mt_apk_session_check":
                        b2 = 62;
                        break;
                    case "mt_file_transfer_get":
                        b2 = 63;
                        break;
                    case "mt_file_delete":
                        b2 = 64;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                Object obj = "mt_apk_resource_read";
                String str6 = "recursive";
                String str7 = "destinationPath";
                switch (b2) {
                    case 0:
                    case 13:
                    case 37:
                    case 64:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, str6);
                        break;
                    case 1:
                        String strM15167 = C4967.m15167(jSONObjectM20135, "target");
                        if (strM15167.equals("overview")) {
                            c2861.m9443(R.string.MT_Protector, C21576.m49059(R.string.MT_Protector, new Object[0]));
                        } else if (m20122(strM15167) == 0) {
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "target");
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "query");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "queryType");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "matchMode");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "caseSensitive");
                        break;
                    case 2:
                    case 9:
                    case 31:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "methodResolution");
                        c2861.m9426(m20123(jSONObjectM20135, "scopes"), R.string.MT_Protector);
                        break;
                    case 3:
                    case 15:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        JSONArray jSONArrayM20123 = m20123(jSONObjectM20135, "patches");
                        for (int i = 0; i < Math.min(3, jSONArrayM20123.size()); i++) {
                            JSONObject jSONObjectM20134 = m20134(jSONArrayM20123, i);
                            c2861.m9423(i, str5);
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20134, "byteOffset");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20134, "expectedHex");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20134, "replacementHex");
                        }
                        c2861.m9421(jSONArrayM20123.size());
                        break;
                    case 4:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, str6);
                        if (m20133(jSONObjectM20135, "minSize", -1L) >= 0) {
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "minSize");
                        }
                        if (m20133(jSONObjectM20135, "maxSize", -1L) >= 0) {
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "maxSize");
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "minModifiedAt");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "maxModifiedAt");
                        if (!C4967.m15167(jSONObjectM20135, "namePattern").isEmpty()) {
                            c2861.m9438(C21576.m49059(R.string.MT_Protector, new Object[0]));
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "namePattern");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "namePatternType");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "nameMatchMode");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "nameCaseSensitive");
                        }
                        if (!C4967.m15167(jSONObjectM20135, "contentPattern").isEmpty()) {
                            c2861.m9438(C21576.m49059(R.string.MT_Protector, new Object[0]));
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contentPattern");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contentPatternType");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contentCaseSensitive");
                        }
                        break;
                    case 5:
                    case 63:
                        c2861.m9422(R.string.mcp_log_l_transfer_id, jSONObjectM20135, "transferId");
                        break;
                    case 6:
                    case 8:
                    case 46:
                        JSONArray jSONArrayM20124 = m20123(jSONObjectM20135, str.endsWith("_read") ? "reads" : str.endsWith("_edit") ? "edits" : "adds");
                        int i2 = 0;
                        while (i2 < Math.min(3, jSONArrayM20124.size())) {
                            JSONObject jSONObjectM20136 = m20134(jSONArrayM20124, i2);
                            Object obj2 = obj;
                            if (str.equals(obj2)) {
                                str2 = str5;
                                c2861.m9438(str2);
                            } else {
                                str2 = str5;
                                c2861.m9423(i2, C4967.m15167(jSONObjectM20136, "kind"));
                            }
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20136, "locator");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20136, "variant");
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20136, "valueXml");
                            JSONArray jSONArrayM20125 = m20123(jSONObjectM20136, "values");
                            for (int i3 = 0; i3 < Math.min(3, jSONArrayM20125.size()); i3++) {
                                JSONObject jSONObjectM20137 = m20134(jSONArrayM20125, i3);
                                c2861.m9438(m20139(C21576.m49059(R.string.MT_Protector, new Object[0]), " · ", m20119(C4967.m15167(jSONObjectM20137, "variant"))));
                                c2861.m9422(R.string.MT_Protector, jSONObjectM20137, "valueXml");
                            }
                            c2861.m9421(jSONArrayM20125.size());
                            i2++;
                            obj = obj2;
                            str5 = str2;
                        }
                        c2861.m9421(jSONArrayM20124.size());
                        break;
                    case 7:
                        String strM15168 = C4967.m15167(jSONObjectM20135, "view");
                        if (!strM15168.equals("resource_table") && !strM15168.equals("resource_table_variants")) {
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "view");
                        }
                        c2861.m9443(R.string.MT_Protector, m20136(R.string.MT_Protector, C4967.m15167(jSONObjectM20135, "typeName")));
                        c2861.m9443(R.string.MT_Protector, m20136(R.string.MT_Protector, m20125(C4967.m15167(jSONObjectM20135, "variant"))));
                        break;
                    case 10:
                    case 14:
                    case 17:
                    case 19:
                    case 21:
                    case 22:
                    case 42:
                    case 53:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "itemKind");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "addressKind");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "address");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "instructionMode");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "scanKind");
                        c2861.m9426(m20123(jSONObjectM20135, "referenceKinds"), R.string.MT_Protector);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "expectedHex");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "replacementAssembly");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "expectedText");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "replacementText");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "paddingMode");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "maxBytes");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "maxInstructions");
                        break;
                    case 11:
                    case 29:
                        c2861.m9431(jSONObjectM20135, "prefix", R.string.MT_Protector, R.string.MT_Protector);
                        break;
                    case 12:
                        c2861.m9422(R.string.mcp_log_l_workspace_id, jSONObjectM20135, "workspaceId");
                        break;
                    case 16:
                    case 23:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        c2861.m9442(jSONObjectM20135);
                        JSONArray jSONArrayM20126 = m20123(jSONObjectM20135, "edits");
                        for (int i4 = 0; i4 < Math.min(3, jSONArrayM20126.size()); i4++) {
                            JSONObject jSONObjectM20138 = m20134(jSONArrayM20126, i4);
                            c2861.m9423(i4, C4967.m15167(jSONObjectM20138, "mode"));
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20138, "matchText");
                            c2861.m9428(jSONObjectM20138, R.string.MT_Protector);
                        }
                        c2861.m9421(jSONArrayM20126.size());
                        break;
                    case 18:
                        c2861.m9422(R.string.mcp_log_l_session_id, jSONObjectM20135, "editSessionId");
                        c2861.m9431(jSONObjectM20135, "outputPath", R.string.MT_Protector, R.string.MT_Protector);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "overwrite");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "sign");
                        break;
                    case 20:
                    case 25:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "style");
                        c2861.m9439(jSONObjectM20135);
                        break;
                    case 24:
                    case 39:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "entryPath");
                        c2861.m9439(jSONObjectM20135);
                        c2861.m9442(jSONObjectM20135);
                        break;
                    case 26:
                    case 50:
                    case 51:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "entryPath");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "byteOffset");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "maxBytes");
                        break;
                    case 27:
                        c2861.m9422(R.string.mcp_log_l_workspace_id, jSONObjectM20135, "workspaceId");
                        break;
                    case 28:
                    case 40:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9442(jSONObjectM20135);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "hex");
                        c2861.m9428(jSONObjectM20135, R.string.MT_Protector);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "size");
                        break;
                    case 30:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9442(jSONObjectM20135);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contentPattern");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contentPatternType");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contentCaseSensitive");
                        c2861.m9428(jSONObjectM20135, R.string.MT_Protector);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "replaceMode");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "replacementMode");
                        if (m20133(jSONObjectM20135, "expectedReplacements", -1L) >= 0) {
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "expectedReplacements");
                        }
                        break;
                    case 32:
                    case 33:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "entryPath");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, str6);
                        break;
                    case 34:
                    case 36:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "sourcePath");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, str7);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "overwrite");
                        break;
                    case 35:
                        JSONValue jSONValue = jSONObjectM20135.get(MotionUtils.EASING_TYPE_PATH);
                        if (jSONValue != null && jSONValue.isString() && jSONValue.asString().isEmpty()) {
                            c2861.m9443(R.string.MT_Protector, C21576.m49059(R.string.MT_Protector, new Object[0]));
                        } else {
                            c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        }
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, str6);
                        break;
                    case 38:
                        c2861.m9431(jSONObjectM20135, "prefix", R.string.MT_Protector, R.string.MT_Protector);
                        break;
                    case 41:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "query");
                        c2861.m9443(R.string.MT_Protector, m20140(C4967.m15167(jSONObjectM20135, "appType")));
                        break;
                    case 43:
                        c2861.m9422(R.string.mcp_log_l_workspace_id, jSONObjectM20135, "workspaceId");
                        c2861.m9422(R.string.mcp_log_l_session_id, jSONObjectM20135, "editSessionId");
                        break;
                    case 44:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "localPath");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "overwrite");
                        break;
                    case 47:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "temporary");
                        break;
                    case 48:
                    case 49:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9449(jSONObjectM20135);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "overwrite");
                        if (str.equals("mt_file_transfer_create_upload")) {
                            c2861.m9431(jSONObjectM20135, "sha256", R.string.MT_Protector, R.string.MT_Protector);
                        }
                        break;
                    case 52:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 60:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "outputPath");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "level");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "overwrite");
                        boolean zEquals = str.equals("mt_zip_create");
                        boolean zEquals2 = str.equals("mt_zip_update");
                        JSONArray jSONArrayM20127 = m20123(jSONObjectM20135, zEquals2 ? "operations" : zEquals ? "sources" : "entries");
                        if (!zEquals2 && !jSONArrayM20127.isEmpty()) {
                            c2861.m9438(zEquals ? C21576.m49059(R.string.MT_Protector, new Object[0]) + " → " + C21576.m49059(R.string.MT_Protector, new Object[0]) : C21576.m49059(R.string.MT_Protector, new Object[0]) + " → " + C21576.m49059(R.string.MT_Protector, new Object[0]));
                        }
                        int i5 = 0;
                        while (i5 < Math.min(3, jSONArrayM20127.size())) {
                            JSONObject jSONObjectM20139 = m20134(jSONArrayM20127, i5);
                            if (zEquals2) {
                                c2861.m9423(i5, C4967.m15167(jSONObjectM20139, "type"));
                                c2861.m9422(R.string.MT_Protector, jSONObjectM20139, "sourcePath");
                                c2861.m9422(R.string.MT_Protector, jSONObjectM20139, "entryPath");
                                str3 = str7;
                                c2861.m9422(R.string.MT_Protector, jSONObjectM20139, str3);
                                c2861.m9422(R.string.MT_Protector, jSONObjectM20139, "newEntryPath");
                                String strM15169 = C4967.m15167(jSONObjectM20139, "type");
                                JSONValue jSONValue2 = jSONObjectM20139.get("entryPath");
                                if (strM15169.equals("add")) {
                                    c2861.m9422(R.string.MT_Protector, jSONObjectM20139, "overwrite");
                                } else if (jSONValue2 != null && jSONValue2.isString() && jSONValue2.asString().endsWith("/")) {
                                    if (strM15169.equals("delete")) {
                                        str4 = str6;
                                        c2861.m9422(R.string.MT_Protector, jSONObjectM20139, str4);
                                    } else {
                                        str4 = str6;
                                        if (strM15169.equals("rename")) {
                                            c2861.m9422(R.string.MT_Protector, jSONObjectM20139, "mergeDirectories");
                                        }
                                    }
                                }
                                str4 = str6;
                            } else {
                                c2861.m9447(jSONObjectM20139, !zEquals);
                                str4 = str6;
                                str3 = str7;
                            }
                            i5++;
                            str6 = str4;
                            str7 = str3;
                        }
                        c2861.m9421(jSONArrayM20127.size());
                        break;
                    case 56:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        break;
                    case 57:
                        JSONArray jSONArrayM20128 = m20123(jSONObjectM20135, "deletes");
                        for (int i6 = 0; i6 < Math.min(3, jSONArrayM20128.size()); i6++) {
                            JSONObject jSONObjectM201310 = m20134(jSONArrayM20128, i6);
                            if (jSONArrayM20128.size() > 1) {
                                c2861.m9423(i6, C4967.m15167(jSONObjectM201310, "kind"));
                            }
                            if (C4967.m15167(jSONObjectM201310, "kind").equals("type_variant")) {
                                c2861.m9422(R.string.mcp_log_l_package_id, jSONObjectM201310, "packageId");
                                c2861.m9422(R.string.mcp_log_l_type_id, jSONObjectM201310, "typeId");
                                c2861.m9443(R.string.MT_Protector, m20125(C4967.m15167(jSONObjectM201310, "variant")));
                            } else {
                                c2861.m9443(R.string.MT_Protector, m20118(jSONObjectM201310));
                            }
                        }
                        c2861.m9421(jSONArrayM20128.size());
                        break;
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        c2861.m9422(R.string.mcp_log_l_session_id, jSONObjectM20135, "editSessionId");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                        c2861.m9422(R.string.mcp_log_l_workspace_id, jSONObjectM20135, "workspaceId");
                        break;
                    case 61:
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                        c2861.m9442(jSONObjectM20135);
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "pattern");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "patternType");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "caseSensitive");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contextBefore");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "contextAfter");
                        break;
                    case 62:
                        c2861.m9422(R.string.mcp_log_l_session_id, jSONObjectM20135, "editSessionId");
                        c2861.m9422(R.string.MT_Protector, jSONObjectM20135, "runBuildChecks");
                        break;
                }
                if (z2) {
                    c2861.m9420();
                }
                return c2861.toString();
            default:
                return C4967.m15165(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:273:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:292:0x0422  */
    /* JADX WARN: Code duplicated, block: B:459:0x0669  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m20128(JSONObject jSONObject, String str) {
        byte b;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String strM46451;
        byte b2;
        String strM49059;
        String str9;
        String strM15167;
        str.getClass();
        switch (str) {
            case "mt_file_create_directory":
                b = 0;
                break;
            case "mt_file_get_access_policy":
                b = 1;
                break;
            case "mt_apk_search":
                b = 2;
                break;
            case "mt_apk_dex_xref":
                b = 3;
                break;
            case "mt_apk_patch_bytes":
                b = 4;
                break;
            case "mt_file_search":
                b = 5;
                break;
            case "mt_file_transfer_cancel":
                b = 6;
                break;
            case "mt_apk_resource_edit":
                b = 7;
                break;
            case "mt_apk_resource_list":
                b = 8;
                break;
            case "mt_apk_resource_read":
                b = 9;
                break;
            case "mt_apk_resource_xref":
                b = 10;
                break;
            case "mt_apk_native_disassemble":
                b = 11;
                break;
            case "mt_apk_list_entries":
                b = 12;
                break;
            case "mt_apk_read_signature":
                b = cb.k;
                break;
            case "mt_file_delete_directory":
                b = cb.f82047l;
                break;
            case "mt_apk_native_list_items":
                b = 15;
                break;
            case "mt_file_patch_bytes":
                b = 16;
                break;
            case "mt_apk_edit_text":
                b = 17;
                break;
            case "mt_apk_native_xref":
                b = 18;
                break;
            case "mt_apk_build":
                b = 19;
                break;
            case "mt_apk_native_patch_string":
                b = 20;
                break;
            case "mt_apk_dex_read_pseudocode":
                b = 21;
                break;
            case "mt_apk_native_map_address":
                b = 22;
                break;
            case "mt_apk_native_patch_instructions":
                b = 23;
                break;
            case "mt_file_edit_text":
                b = 24;
                break;
            case "mt_zip_read_text":
                b = 25;
                break;
            case "mt_apk_read_text":
                b = 26;
                break;
            case "mt_zip_read_bytes":
                b = 27;
                break;
            case "mt_apk_workspace_delete":
                b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                break;
            case "mt_file_write_bytes":
                b = 29;
                break;
            case "mt_apk_dex_list_classes":
                b = 30;
                break;
            case "mt_file_replace_text":
                b = bo.j;
                break;
            case "mt_apk_dex_read_class_outline":
                b = UTF8.S_CS3;
                break;
            case "mt_zip_list":
                b = PublicSuffixDatabase.EXCEPTION_MARKER;
                break;
            case "mt_zip_test":
                b = 34;
                break;
            case "mt_file_copy":
                b = 35;
                break;
            case "mt_file_list":
                b = 36;
                break;
            case "mt_file_move":
                b = 37;
                break;
            case "mt_file_stat":
                b = 38;
                break;
            case "mt_apk_list_available_apks":
                b = 39;
                break;
            case "mt_file_read_text":
                b = 40;
                break;
            case "mt_file_append_text":
                b = 41;
                break;
            case "mt_apk_list_installed_apps":
                b = 42;
                break;
            case "mt_apk_native_inspect":
                b = 43;
                break;
            case "mt_apk_continue":
                b = 44;
                break;
            case "mt_apk_copy_entry":
                b = 45;
                break;
            case "mt_file_truncate_bytes":
                b = 46;
                break;
            case "mt_apk_resource_add":
                b = 47;
                break;
            case "mt_apk_workspace_list":
                b = UTF8.S_P3A;
                break;
            case "mt_apk_workspace_open":
                b = 49;
                break;
            case "mt_file_transfer_create_upload":
                b = 50;
                break;
            case "mt_file_transfer_create_download":
                b = 51;
                break;
            case "mt_apk_read_bytes":
                b = 52;
                break;
            case "mt_file_read_bytes":
                b = 53;
                break;
            case "mt_zip_create":
                b = 54;
                break;
            case "mt_apk_native_analyze_control_flow":
                b = 55;
                break;
            case "mt_file_append_bytes":
                b = 56;
                break;
            case "mt_zip_extract":
                b = 57;
                break;
            case "mt_apk_install":
                b = 58;
                break;
            case "mt_apk_resource_delete":
                b = 59;
                break;
            case "mt_apk_delete_target":
                b = 60;
                break;
            case "mt_apk_session_create":
                b = Base32Encoder.DEFAULT_PADDING;
                break;
            case "mt_zip_update":
                b = 62;
                break;
            case "mt_file_search_text":
                b = 63;
                break;
            case "mt_apk_session_check":
                b = 64;
                break;
            case "mt_file_transfer_get":
                b = 65;
                break;
            case "mt_file_delete":
                b = 66;
                break;
            default:
                b = -1;
                break;
        }
        String str10 = "query";
        String str11 = MotionUtils.EASING_TYPE_PATH;
        String strM42088 = "";
        String str12 = " → ";
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                JSONObject jSONObjectM20135 = m20135(jSONObject);
                String strM15168 = C4967.m15167(jSONObjectM20135, "locator");
                if (strM15168.isEmpty()) {
                    str4 = "sourcePath";
                    String[] strArr = {"reads", "edits", "adds"};
                    str2 = "adds";
                    str3 = "edits";
                    int i = 0;
                    while (i < 3) {
                        String[] strArr2 = strArr;
                        strM15168 = C4967.m15167(m20134(m20123(jSONObjectM20135, strArr[i]), 0), "locator");
                        if (strM15168.isEmpty()) {
                            i++;
                            strArr = strArr2;
                        }
                    }
                } else {
                    str2 = "adds";
                    str3 = "edits";
                    str4 = "sourcePath";
                }
                String strM15169 = C4967.m15167(jSONObjectM20135, MotionUtils.EASING_TYPE_PATH);
                if (str.equals("mt_apk_resource_edit") || str.equals("mt_apk_resource_add")) {
                    JSONObject jSONObjectM20134 = m20134(m20123(jSONObjectM20135, str.endsWith("_edit") ? str3 : str2), 0);
                    String strM151610 = C4967.m15167(jSONObjectM20134, "valueXml");
                    if (strM151610.isEmpty()) {
                        strM151610 = C4967.m15167(m20134(m20123(jSONObjectM20134, "values"), 0), "valueXml");
                    }
                    int iIndexOf = strM151610.indexOf(60);
                    int iIndexOf2 = strM151610.indexOf(62);
                    if (iIndexOf < 0 || iIndexOf2 <= iIndexOf) {
                        str5 = " → ";
                        str6 = strM15169;
                        str7 = "query";
                        str8 = MotionUtils.EASING_TYPE_PATH;
                    } else {
                        int i2 = iIndexOf + 1;
                        int i3 = i2;
                        while (i3 < iIndexOf2 && !Character.isWhitespace(strM151610.charAt(i3))) {
                            i3++;
                        }
                        String strSubstring = strM151610.substring(i2, i3);
                        String str13 = "";
                        while (true) {
                            if (i3 < iIndexOf2) {
                                while (i3 < iIndexOf2 && Character.isWhitespace(strM151610.charAt(i3))) {
                                    i3++;
                                }
                                str6 = strM15169;
                                str7 = str10;
                                int i4 = i3;
                                while (true) {
                                    if (i4 >= iIndexOf2 || Character.isWhitespace(strM151610.charAt(i4))) {
                                        str5 = str12;
                                    } else {
                                        str5 = str12;
                                        if (strM151610.charAt(i4) != '=') {
                                            i4++;
                                            str12 = str5;
                                        }
                                    }
                                }
                                String strSubstring2 = strM151610.substring(i3, i4);
                                while (i4 < iIndexOf2 && Character.isWhitespace(strM151610.charAt(i4))) {
                                    i4++;
                                }
                                if (i4 < iIndexOf2) {
                                    int i5 = i4 + 1;
                                    if (strM151610.charAt(i4) == '=') {
                                        while (i5 < iIndexOf2 && Character.isWhitespace(strM151610.charAt(i5))) {
                                            i5++;
                                        }
                                        if (i5 < iIndexOf2) {
                                            int i6 = i5 + 1;
                                            char cCharAt = strM151610.charAt(i5);
                                            if (cCharAt == '\'' || cCharAt == '\"') {
                                                int i7 = i6;
                                                while (true) {
                                                    str8 = str11;
                                                    if (i7 < iIndexOf2 && strM151610.charAt(i7) != cCharAt) {
                                                        i7++;
                                                        str11 = str8;
                                                    }
                                                }
                                                if (i7 < iIndexOf2) {
                                                    int i8 = i7 + 1;
                                                    String strSubstring3 = strM151610.substring(i6, i7);
                                                    if (!strSubstring2.equals("name")) {
                                                        if (strSubstring2.equals("type")) {
                                                            strSubstring = strSubstring3;
                                                        }
                                                        strSubstring3 = str13;
                                                    }
                                                    str13 = strSubstring3;
                                                    i3 = i8;
                                                    strM15169 = str6;
                                                    str10 = str7;
                                                    str12 = str5;
                                                    str11 = str8;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                str5 = str12;
                                str6 = strM15169;
                                str7 = str10;
                            }
                            str8 = str11;
                        }
                        if (strSubstring.equals("string-array") || strSubstring.equals("integer-array")) {
                            strSubstring = "array";
                        }
                        if (!str13.isEmpty()) {
                            strM46451 = C20196.m46451(strSubstring, "/", str13);
                        }
                    }
                    strM46451 = "";
                } else {
                    str5 = " → ";
                    str6 = strM15169;
                    str7 = "query";
                    str8 = MotionUtils.EASING_TYPE_PATH;
                    strM46451 = "";
                }
                switch (str.hashCode()) {
                    case -1971780391:
                        if (str.equals("mt_file_get_access_policy")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1888249149:
                        if (str.equals("mt_apk_search")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1647254348:
                        if (str.equals("mt_apk_resource_list")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1346956598:
                        if (str.equals("mt_apk_list_entries")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1274719382:
                        if (str.equals("mt_apk_read_signature")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -283853312:
                        if (str.equals("mt_zip_read_text")) {
                            b2 = 5;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -225549832:
                        if (str.equals("mt_zip_read_bytes")) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -22322168:
                        if (str.equals("mt_apk_dex_list_classes")) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386458560:
                        if (str.equals("mt_file_copy")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386721001:
                        if (str.equals("mt_file_list")) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 386756636:
                        if (str.equals("mt_file_move")) {
                            b2 = 10;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 408889875:
                        if (str.equals("mt_apk_list_available_apks")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 505070749:
                        if (str.equals("mt_apk_list_installed_apps")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 707888898:
                        if (str.equals("mt_apk_continue")) {
                            b2 = cb.k;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 714809027:
                        if (str.equals("mt_apk_copy_entry")) {
                            b2 = cb.f82047l;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 978779171:
                        if (str.equals("mt_apk_workspace_list")) {
                            b2 = 15;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1011302619:
                        if (str.equals("mt_file_transfer_create_upload")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1063038178:
                        if (str.equals("mt_file_transfer_create_download")) {
                            b2 = 17;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1234286962:
                        if (str.equals("mt_zip_create")) {
                            b2 = 18;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1583059936:
                        if (str.equals("mt_apk_install")) {
                            b2 = 19;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1598557249:
                        if (str.equals("mt_apk_resource_delete")) {
                            b2 = 20;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        break;
                    case 1:
                        str9 = str7;
                        break;
                    case 2:
                        strM49059 = m20139(m20136(R.string.MT_Protector, C4967.m15167(jSONObjectM20135, "typeName")), " · ", m20136(R.string.MT_Protector, m20125(C4967.m15167(jSONObjectM20135, "variant"))));
                        break;
                    case 3:
                    case 7:
                        str9 = "prefix";
                        strM49059 = C4967.m15167(jSONObjectM20135, "prefix").isEmpty() ? C21576.m49059(R.string.MT_Protector, new Object[0]) : C4967.m15167(jSONObjectM20135, str9);
                        break;
                    case 4:
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        break;
                    case 5:
                    case 6:
                        strM49059 = m20139(C18063.m42088(47, 1, str6), " · ", C4967.m15167(jSONObjectM20135, "entryPath"));
                        break;
                    case 8:
                    case 10:
                        strM49059 = m20139(C4967.m15167(jSONObjectM20135, str4), str5, C4967.m15167(jSONObjectM20135, "destinationPath"));
                        break;
                    case 9:
                        JSONValue jSONValue = jSONObjectM20135.get(str8);
                        strM49059 = (jSONValue == null || !jSONValue.isString() || !jSONValue.asString().isEmpty()) ? str6 : C21576.m49059(R.string.MT_Protector, new Object[0]);
                        break;
                    case 11:
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        break;
                    case 12:
                        strM15167 = C4967.m15167(jSONObjectM20135, str7);
                        if (strM15167.isEmpty()) {
                            strM15167 = m20140(C4967.m15167(jSONObjectM20135, "appType"));
                        }
                        strM49059 = strM15167;
                        break;
                    case 13:
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        break;
                    case 14:
                        strM49059 = C4967.m15167(jSONObjectM20135, "direction").equals("local_to_edit_session") ? m20139(C4967.m15167(jSONObjectM20135, "localPath"), str5, m20138(strM15168)) : m20139(m20138(strM15168), str5, C4967.m15167(jSONObjectM20135, "localPath"));
                        break;
                    case 15:
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        break;
                    case 16:
                    case 17:
                    case 19:
                        JSONValue jSONValue2 = jSONObjectM20135.get(str8);
                        if (jSONValue2 != null && jSONValue2.isString()) {
                            strM42088 = C18063.m42088(47, 1, jSONValue2.asString());
                        }
                        strM49059 = strM42088;
                        break;
                    case 18:
                        strM49059 = C4967.m15167(jSONObjectM20135, "outputPath");
                        break;
                    case 20:
                        JSONObject jSONObjectM20136 = m20134(m20123(jSONObjectM20135, "deletes"), 0);
                        if (C4967.m15167(jSONObjectM20136, "kind").equals("type_variant")) {
                            String strM151611 = C4967.m15167(jSONObjectM20136, "typeId");
                            strM15167 = m20115(strM151611.isEmpty() ? "" : C21576.m49059(R.string.mcp_log_resource_type_id, strM151611), C4967.m15167(jSONObjectM20136, "variant"));
                        } else {
                            strM15167 = m20118(jSONObjectM20136);
                        }
                        strM49059 = strM15167;
                        break;
                    default:
                        if (!strM15168.isEmpty()) {
                            strM49059 = m20138(strM15168);
                        }
                        break;
                }
                if (strM46451.isEmpty()) {
                    strM46451 = strM49059;
                }
                if (str.startsWith("mt_apk_native_") && !C4967.m15167(jSONObjectM20135, "address").isEmpty()) {
                    strM46451 = m20139(C18063.m42088(47, 1, strM46451), " · ", C4967.m15167(jSONObjectM20135, "address"));
                }
                return C4967.m15164(512, strM46451);
            default:
                String str14 = " → ";
                String[] strArr3 = {"locator", MotionUtils.EASING_TYPE_PATH, "sourcePath", "outputPath", "query"};
                int i9 = 0;
                while (i9 < 5) {
                    String str15 = str14;
                    String strM151612 = C4967.m15167(jSONObject, strArr3[i9]);
                    if (!strM151612.isEmpty()) {
                        String strM151613 = C4967.m15167(jSONObject, "destinationPath");
                        if (!strM151613.isEmpty()) {
                            strM151612 = C12669.m31438(new StringBuilder(), C4967.m15164(256, strM151612), str15, strM151613);
                        }
                        return C4967.m15164(512, strM151612);
                    }
                    i9++;
                    str14 = str15;
                }
                String[] strArr4 = {"reads", "edits", "adds", "targets", "entries", "sources"};
                for (int i10 = 0; i10 < 6; i10++) {
                    JSONValue jSONValue3 = jSONObject.get(strArr4[i10]);
                    if (jSONValue3 != null && jSONValue3.isArray() && !jSONValue3.asArray().isEmpty()) {
                        JSONValue jSONValue4 = jSONValue3.asArray().get(0);
                        if (jSONValue4.isObject()) {
                            String[] strArr5 = {"locator", "entryPath", "sourcePath"};
                            for (int i11 = 0; i11 < 3; i11++) {
                                String strM151614 = C4967.m15167(jSONValue4.asObject(), strArr5[i11]);
                                if (!strM151614.isEmpty()) {
                                    return C4967.m15164(512, strM151614);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return "";
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int m20126(JSONObject jSONObject, String str) {
        String str2;
        String strM20130;
        JSONObject jSONObjectM20135 = m20135(jSONObject);
        str.getClass();
        switch (str) {
            case "mt_apk_search":
                str2 = "target";
                strM20130 = C4967.m15167(jSONObjectM20135, str2);
                break;
            case "mt_apk_resource_list":
                str2 = "view";
                strM20130 = C4967.m15167(jSONObjectM20135, str2);
                break;
            case "mt_apk_edit_text":
            case "mt_apk_read_text":
            case "mt_apk_delete_target":
                strM20130 = m20130(C4967.m15167(jSONObjectM20135, "locator"));
                break;
            case "mt_apk_copy_entry":
                str2 = "direction";
                strM20130 = C4967.m15167(jSONObjectM20135, str2);
                break;
            case "mt_apk_resource_delete":
                strM20130 = m20111(m20123(jSONObjectM20135, "deletes"));
                break;
            default:
                strM20130 = "";
                break;
        }
        return m20132(str, strM20130);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m20130(String str) {
        int iIndexOf = str.indexOf(58);
        return (iIndexOf <= 0 || iIndexOf >= str.length() + (-1)) ? "" : str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m20122(String str) {
        str.getClass();
        switch (str) {
            case "resource_table_values":
                return R.string.MT_Protector;
            case "resource_table_file_paths":
                return R.string.MT_Protector;
            case "files":
                return R.string.MT_Protector;
            case "smali":
                return R.string.MT_Protector;
            case "dex_string_members":
                return R.string.MT_Protector;
            case "resource_table_names":
                return R.string.MT_Protector;
            case "overview":
                return R.string.MT_Protector;
            case "dex_strings":
                return R.string.MT_Protector;
            case "native_strings":
                return R.string.MT_Protector;
            case "native_symbols":
                return R.string.MT_Protector;
            case "dex_names":
                return R.string.MT_Protector;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x013b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0181  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m20132(String str, String str2) {
        str.getClass();
        switch (str) {
            case "mt_apk_search":
                return m20122(str2);
            case "mt_apk_resource_list":
                return "resource_table_variants".equals(str2) ? R.string.MT_Protector : R.string.MT_Protector;
            case "mt_apk_list_entries":
                return R.string.MT_Protector;
            case "mt_apk_edit_text":
                str2.getClass();
                switch (str2) {
                    case "dex_method":
                        return R.string.MT_Protector;
                    case "axml":
                        return R.string.MT_Protector;
                    case "zip_entry":
                        return R.string.MT_Protector;
                    case "dex_class":
                        return R.string.MT_Protector;
                    default:
                        return 0;
                }
            case "mt_apk_read_text":
                str2.getClass();
                switch (str2) {
                    case "dex_method":
                        return R.string.MT_Protector;
                    case "axml":
                        return R.string.MT_Protector;
                    case "zip_entry":
                        return R.string.MT_Protector;
                    case "dex_class":
                        return R.string.MT_Protector;
                    case "dex_field":
                        return R.string.MT_Protector;
                    default:
                        return 0;
                }
            case "mt_apk_dex_list_classes":
                return R.string.MT_Protector;
            case "mt_apk_copy_entry":
                str2.getClass();
                if (str2.equals("workspace_to_local")) {
                    return R.string.MT_Protector;
                }
                if (str2.equals("local_to_edit_session")) {
                    return R.string.MT_Protector;
                }
                return 0;
            case "mt_apk_resource_delete":
                str2.getClass();
                if (str2.equals("type_variant")) {
                    return R.string.MT_Protector;
                }
                return !str2.equals("variant") ? R.string.MT_Protector : R.string.MT_Protector;
            case "mt_apk_delete_target":
                str2.getClass();
                switch (str2.hashCode()) {
                    case -26029559:
                        if (!str2.equals("dex_method")) {
                        }
                        break;
                    case 3008534:
                        if (!str2.equals("axml")) {
                        }
                        break;
                    case 277980628:
                        if (!str2.equals("zip_entry")) {
                        }
                        break;
                    case 1514136400:
                        if (!str2.equals("dex_class")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instruction units count: 588
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C7336.m20132(java.lang.String, java.lang.String):int");
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static int m20131(int i, JSONObject jSONObject, String str) {
                int iM20132;
                if (str.equals("mt_apk_continue")) {
                    JSONObject jSONObjectM20142 = m20142(jSONObject, e.m);
                    if (!C4967.m15167(jSONObjectM20142, "appType").isEmpty()) {
                        return R.string.MT_Protector;
                    }
                    if (!m20142(jSONObjectM20142, "textWindow").isEmpty()) {
                        String strM15167 = C4967.m15167(jSONObjectM20142, "style");
                        iM20132 = (strM15167.equals("readable") || strM15167.equals("instruction")) ? R.string.MT_Protector : m20132("mt_apk_read_text", m20130(C4967.m15167(jSONObjectM20142, "locator")));
                    } else if (!m20142(jSONObjectM20142, "byteWindow").isEmpty()) {
                        iM20132 = R.string.MT_Protector;
                    } else if (jSONObjectM20142.getJSONArray("fields") == null || jSONObjectM20142.getJSONArray("methods") == null) {
                        String strM15168 = C4967.m15167(jSONObjectM20142, "view");
                        iM20132 = (strM15168.equals("resource_table") || strM15168.equals("resource_table_variants")) ? m20132("mt_apk_resource_list", strM15168) : 0;
                    } else {
                        iM20132 = R.string.MT_Protector;
                    }
                    if (iM20132 != 0) {
                        return iM20132;
                    }
                }
                return i;
            }

            /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
            public static int m20117(JSONObject jSONObject, String str) {
                String str2;
                str.getClass();
                switch (str) {
                    case "mt_apk_patch_bytes":
                    case "mt_file_patch_bytes":
                        str2 = "patches";
                        break;
                    case "mt_apk_resource_edit":
                    case "mt_apk_edit_text":
                    case "mt_file_edit_text":
                        str2 = "edits";
                        break;
                    case "mt_apk_resource_read":
                        str2 = "reads";
                        break;
                    case "mt_apk_resource_add":
                        str2 = "adds";
                        break;
                    case "mt_zip_create":
                        str2 = "sources";
                        break;
                    case "mt_zip_extract":
                        str2 = "entries";
                        break;
                    case "mt_apk_resource_delete":
                        str2 = "deletes";
                        break;
                    case "mt_zip_update":
                        str2 = "operations";
                        break;
                    default:
                        str2 = "";
                        break;
                }
                if (str2.isEmpty()) {
                    return 0;
                }
                return m20123(m20135(jSONObject), str2).size();
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static String m20110(int i, String str) {
                return i > 1 ? C4967.m15164(512, m20139(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)), " · ", str)) : str;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static String m20113(JSONObject jSONObject, String str, String str2) {
                JSONObject jSONObjectM20142 = m20142(jSONObject, e.m);
                if (str.startsWith("mt_file_transfer_")) {
                    JSONValue jSONValue = jSONObjectM20142.get(MotionUtils.EASING_TYPE_PATH);
                    String strM42088 = (jSONValue == null || !jSONValue.isString()) ? "" : C18063.m42088(47, 1, jSONValue.asString());
                    if (!strM42088.isEmpty()) {
                        return C4967.m15164(512, strM42088);
                    }
                }
                if (str.equals("mt_apk_resource_read")) {
                    JSONObject jSONObjectM20134 = m20134(m20123(jSONObjectM20142, "results"), 0);
                    String strM20139 = m20139(C4967.m15167(jSONObjectM20134, "type"), "/", C4967.m15167(jSONObjectM20134, "name"));
                    if (!strM20139.isEmpty()) {
                        return C4967.m15164(512, m20139(strM20139, " · ", m20119(C4967.m15167(jSONObjectM20134, "variant"))));
                    }
                }
                if (str.equals("mt_apk_continue")) {
                    if (!C4967.m15167(jSONObjectM20142, "appType").isEmpty()) {
                        String strM15167 = C4967.m15167(jSONObjectM20142, "query");
                        return strM15167.isEmpty() ? m20140(C4967.m15167(jSONObjectM20142, "appType")) : strM15167;
                    }
                    String strM20138 = m20138(C4967.m15167(jSONObjectM20142, "locator"));
                    if (!strM20138.isEmpty()) {
                        return C4967.m15164(512, m20139(strM20138, " · ", m20119(C4967.m15167(jSONObjectM20142, "itemKind"))));
                    }
                    if (!C4967.m15167(jSONObjectM20142, "prefix").isEmpty()) {
                        return C4967.m15167(jSONObjectM20142, "prefix");
                    }
                }
                return str2;
            }

            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
            public static String m20140(String str) {
                str.getClass();
                switch (str) {
                    case "system":
                        return C21576.m49059(R.string.MT_Protector, new Object[0]);
                    case "all":
                        return C21576.m49059(R.string.MT_Protector, new Object[0]);
                    case "user":
                        return C21576.m49059(R.string.MT_Protector, new Object[0]);
                    default:
                        return str;
                }
            }

            /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
            public static boolean m20127(JSONObject jSONObject, String str) {
                return str.equals("mt_apk_install") && C4967.m15167(m20142(jSONObject, e.m), c.a).equals(k.j);
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static String m20138(String str) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf >= 0) {
                    String strSubstring = str.substring(0, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (strSubstring.equals("zip_entry") || strSubstring.equals("axml") || strSubstring.equals("resource")) {
                        return strSubstring2;
                    }
                    if (strSubstring.equals("dex_class") || strSubstring.equals("dex_method") || strSubstring.equals("dex_field")) {
                        int iIndexOf2 = strSubstring2.indexOf(";->");
                        if (iIndexOf2 >= 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(strSubstring2.substring(0, iIndexOf2));
                            sb.append(".");
                            strSubstring2 = ExternalValue$$ExternalSyntheticOutline0.m(iIndexOf2 + 3, strSubstring2, sb);
                        } else if (strSubstring2.endsWith(l.b)) {
                            strSubstring2 = C1402.m5124(1, 0, strSubstring2);
                        }
                        if (strSubstring2.startsWith("L")) {
                            strSubstring2 = strSubstring2.substring(1);
                        }
                        return strSubstring2.replace('/', '.');
                    }
                }
                return str;
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static String m20139(String str, String str2, String str3) {
                if (str.isEmpty()) {
                    return str3;
                }
                return str3.isEmpty() ? str : C20196.m46451(str, str2, str3);
            }

            /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:76:0x00fe  */
            /* JADX WARN: Code duplicated, block: B:83:0x0130  */
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static String m20109(int i, JSONObject jSONObject, String str) {
                C2861 c2861;
                JSONObject jSONObjectM20142;
                long jM20133;
                String strM20118;
                String strM15167 = C4967.m15167(jSONObject, "code");
                if (strM15167.isEmpty()) {
                    strM15167 = C4967.m15167(jSONObject, "errorCode");
                }
                if (i == 0) {
                    strM15167.getClass();
                    switch (strM15167) {
                        case "INVALID_ARGUMENT":
                            i = R.string.MT_Protector;
                            break;
                        case "ZIP_ENTRY_NOT_FOUND":
                        case "RESOURCE_VARIANT_NOT_FOUND":
                        case "RESOURCE_TYPE_VARIANT_NOT_FOUND":
                        case "RESOURCE_NOT_FOUND":
                        case "APK_ENTRY_NOT_FOUND":
                            i = R.string.MT_Protector;
                            break;
                        case "FILE_NOT_FOUND":
                        case "ZIP_NOT_FOUND":
                            i = R.string.MT_Protector;
                            break;
                        default:
                            i = R.string.MT_Protector;
                            break;
                    }
                }
                String str2 = strM15167.length() <= 80 ? strM15167 : "";
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    char cCharAt = str2.charAt(i2);
                    if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                        str2 = "";
                        c2861 = new C2861(4096);
                        StringBuilder sb = new StringBuilder();
                        sb.append(C21576.m49059(i, new Object[0]));
                        sb.append(str2.isEmpty() ? "" : C14442.m34865(" (", str2, MotionUtils.EASING_TYPE_FORMAT_END));
                        c2861.m9448(sb.toString());
                        if (strM15167.equals("INVALID_ARGUMENT")) {
                            c2861.m9445(jSONObject);
                        }
                        if (str.equals("mt_apk_resource_delete")) {
                            JSONObject jSONObjectM20143 = m20142(jSONObject, "diagnostics");
                            jSONObjectM20142 = m20142(jSONObjectM20143, "target");
                            jM20133 = m20133(jSONObjectM20143, "failedDeleteIndex", -1L);
                            if (jM20133 >= 0 && jM20133 < 200) {
                                c2861.m9423((int) jM20133, C4967.m15167(jSONObjectM20142, "kind"));
                            }
                            strM20118 = m20118(jSONObjectM20142);
                            if (!strM20118.isEmpty()) {
                                c2861.m9443(R.string.MT_Protector, strM20118);
                            }
                        }
                        c2861.m9430(m20142(jSONObject, "diagnostics"), str);
                        return c2861.toString();
                    }
                }
                c2861 = new C2861(4096);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C21576.m49059(i, new Object[0]));
                sb2.append(str2.isEmpty() ? "" : C14442.m34865(" (", str2, MotionUtils.EASING_TYPE_FORMAT_END));
                c2861.m9448(sb2.toString());
                if (strM15167.equals("INVALID_ARGUMENT")) {
                    c2861.m9445(jSONObject);
                }
                if (str.equals("mt_apk_resource_delete")) {
                    JSONObject jSONObjectM20144 = m20142(jSONObject, "diagnostics");
                    jSONObjectM20142 = m20142(jSONObjectM20144, "target");
                    jM20133 = m20133(jSONObjectM20144, "failedDeleteIndex", -1L);
                    if (jM20133 >= 0) {
                        c2861.m9423((int) jM20133, C4967.m15167(jSONObjectM20142, "kind"));
                    }
                    strM20118 = m20118(jSONObjectM20142);
                    if (!strM20118.isEmpty()) {
                        c2861.m9443(R.string.MT_Protector, strM20118);
                    }
                }
                c2861.m9430(m20142(jSONObject, "diagnostics"), str);
                return c2861.toString();
            }

            /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
            public static String m20118(JSONObject jSONObject) {
                return m20139("type_variant".equals(C4967.m15167(jSONObject, "kind")) ? m20139(C4967.m15167(jSONObject, "packageId"), "/", C4967.m15167(jSONObject, "typeId")) : m20138(C4967.m15167(jSONObject, "locator")), " · ", m20119(C4967.m15167(jSONObject, "variant")));
            }

            /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
            public static JSONObject m20142(JSONObject jSONObject, String str) {
                JSONValue jSONValue = jSONObject.get(str);
                return (jSONValue == null || !jSONValue.isObject()) ? new JSONObject() : m20135(jSONValue.asObject());
            }

            /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
            public static JSONArray m20123(JSONObject jSONObject, String str) {
                JSONValue jSONValue = jSONObject.get(str);
                return (jSONValue == null || !jSONValue.isArray()) ? new JSONArray() : jSONValue.asArray();
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static JSONObject m20134(JSONArray jSONArray, int i) {
                return (i >= jSONArray.size() || !jSONArray.get(i).isObject()) ? new JSONObject() : m20135(jSONArray.get(i).asObject());
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static long m20133(JSONObject jSONObject, String str, long j) {
                JSONValue jSONValue = jSONObject.get(str);
                if (jSONValue != null && jSONValue.isNumber()) {
                    try {
                        return jSONValue.asLong();
                    } catch (NumberFormatException unused) {
                    }
                }
                return j;
            }

            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
            public static boolean m20121(JSONObject jSONObject, String str) {
                JSONValue jSONValue = jSONObject.get(str);
                return jSONValue != null && jSONValue.isBoolean() && jSONValue.asBoolean();
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public static boolean m20104(JSONObject jSONObject, String str) {
                JSONValue jSONValue = jSONObject.get(str);
                return (jSONValue == null || !jSONValue.isBoolean() || jSONValue.asBoolean()) ? false : true;
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static JSONObject m20135(JSONObject jSONObject) {
                if (jSONObject.size() <= 40) {
                    return jSONObject;
                }
                JSONObject jSONObject2 = new JSONObject();
                Iterator it = jSONObject.iterator();
                int i = 0;
                while (it.hasNext()) {
                    JSONObject.Member member = (JSONObject.Member) it.next();
                    int i2 = i + 1;
                    if (i == 40) {
                        break;
                    }
                    jSONObject2.put(member.getName(), member.getValue());
                    i = i2;
                }
                return jSONObject2;
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            public static String m20136(int i, String str) {
                if ("*".equals(str)) {
                    return C21576.m49059(i, new Object[0]);
                }
                return m20119(str);
            }

            /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
            public static String m20125(String str) {
                return str.startsWith("-") ? str.substring(1) : m20119(str);
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static String m20111(JSONArray jSONArray) {
                if (jSONArray.isEmpty() || jSONArray.size() > 200) {
                    return "";
                }
                String strM15167 = C4967.m15167(m20134(jSONArray, 0), "kind");
                for (int i = 1; i < jSONArray.size(); i++) {
                    if (!strM15167.equals(C4967.m15167(m20134(jSONArray, i), "kind"))) {
                        return "";
                    }
                }
                return strM15167;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static String m20115(String str, String str2) {
                return C4967.m15164(512, m20139(str, " · ", m20125(str2)));
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
            public static String m20119(String str) {
                int i;
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1743438373:
                        if (str.equals("symbols")) {
                            b = 0;
                        }
                        break;
                    case -1420669455:
                        if (str.equals("write_target")) {
                            b = 1;
                        }
                        break;
                    case -1335458389:
                        if (str.equals("delete")) {
                            b = 2;
                        }
                        break;
                    case -1248968420:
                        if (str.equals("insert_after_match")) {
                            b = 3;
                        }
                        break;
                    case -1113584459:
                        if (str.equals("read_only")) {
                            b = 4;
                        }
                        break;
                    case -962584979:
                        if (str.equals("directory")) {
                            b = 5;
                        }
                        break;
                    case -934594754:
                        if (str.equals("rename")) {
                            b = 6;
                        }
                        break;
                    case -908829698:
                        if (str.equals("dex_classes")) {
                            b = 7;
                        }
                        break;
                    case -697996160:
                        if (str.equals("type_variant")) {
                            b = 8;
                        }
                        break;
                    case -608196048:
                        if (str.equals("resource_table_variants")) {
                            b = 9;
                        }
                        break;
                    case -567445985:
                        if (str.equals("contains")) {
                            b = 10;
                        }
                        break;
                    case -341064690:
                        if (str.equals("resource")) {
                            b = 11;
                        }
                        break;
                    case -153875466:
                        if (str.equals("read_write")) {
                            b = 12;
                        }
                        break;
                    case 96417:
                        if (str.equals("add")) {
                            b = cb.k;
                        }
                        break;
                    case 96673:
                        if (str.equals(ProviderConfigurationPermission.ALL_STR)) {
                            b = cb.f82047l;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            b = 15;
                        }
                        break;
                    case 3029889:
                        if (str.equals("both")) {
                            b = 16;
                        }
                        break;
                    case 3059181:
                        if (str.equals("code")) {
                            b = 17;
                        }
                        break;
                    case 3076010:
                        if (str.equals(e.m)) {
                            b = 18;
                        }
                        break;
                    case 3079692:
                        if (str.equals("deny")) {
                            b = 19;
                        }
                        break;
                    case 3143036:
                        if (str.equals("file")) {
                            b = 20;
                        }
                        break;
                    case 3387192:
                        if (str.equals("none")) {
                            b = 21;
                        }
                        break;
                    case 64044235:
                        if (str.equals("insert_before_match")) {
                            b = 22;
                        }
                        break;
                    case 96946943:
                        if (str.equals("exact")) {
                            b = 23;
                        }
                        break;
                    case 97440432:
                        if (str.equals("first")) {
                            b = 24;
                        }
                        break;
                    case 108392519:
                        if (str.equals("regex")) {
                            b = 25;
                        }
                        break;
                    case 182460591:
                        if (str.equals("literal")) {
                            b = 26;
                        }
                        break;
                    case 236785797:
                        if (str.equals("variant")) {
                            b = 27;
                        }
                        break;
                    case 302817373:
                        if (str.equals("resource_table")) {
                            b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        }
                        break;
                    case 466165515:
                        if (str.equals("virtual")) {
                            b = 29;
                        }
                        break;
                    case 851399026:
                        if (str.equals("zip_entries")) {
                            b = 30;
                        }
                        break;
                    case 947936814:
                        if (str.equals("sections")) {
                            b = bo.j;
                        }
                        break;
                    case 1402673274:
                        if (str.equals("replace_match")) {
                            b = UTF8.S_CS3;
                        }
                        break;
                    case 1544803905:
                        if (str.equals("default")) {
                            b = PublicSuffixDatabase.EXCEPTION_MARKER;
                        }
                        break;
                    case 1922795702:
                        if (str.equals("file_offset")) {
                            b = 34;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        i = R.string.MT_Protector;
                        break;
                    case 1:
                        i = R.string.MT_Protector;
                        break;
                    case 2:
                        i = R.string.MT_Protector;
                        break;
                    case 3:
                        i = R.string.MT_Protector;
                        break;
                    case 4:
                        i = R.string.MT_Protector;
                        break;
                    case 5:
                        i = R.string.MT_Protector;
                        break;
                    case 6:
                        i = R.string.MT_Protector;
                        break;
                    case 7:
                        i = R.string.MT_Protector;
                        break;
                    case 8:
                        i = R.string.MT_Protector;
                        break;
                    case 9:
                        i = R.string.MT_Protector;
                        break;
                    case 10:
                        i = R.string.MT_Protector;
                        break;
                    case 11:
                        i = R.string.MT_Protector;
                        break;
                    case 12:
                        i = R.string.MT_Protector;
                        break;
                    case 13:
                        i = R.string.MT_Protector;
                        break;
                    case 14:
                        i = R.string.MT_Protector;
                        break;
                    case 15:
                        i = R.string.MT_Protector;
                        break;
                    case 16:
                        i = R.string.MT_Protector;
                        break;
                    case 17:
                        i = R.string.MT_Protector;
                        break;
                    case 18:
                        i = R.string.MT_Protector;
                        break;
                    case 19:
                        i = R.string.MT_Protector;
                        break;
                    case 20:
                        i = R.string.MT_Protector;
                        break;
                    case 21:
                        i = R.string.MT_Protector;
                        break;
                    case 22:
                        i = R.string.MT_Protector;
                        break;
                    case 23:
                        i = R.string.MT_Protector;
                        break;
                    case 24:
                        i = R.string.MT_Protector;
                        break;
                    case 25:
                        i = R.string.MT_Protector;
                        break;
                    case 26:
                        i = R.string.MT_Protector;
                        break;
                    case 27:
                        i = R.string.MT_Protector;
                        break;
                    case 28:
                        i = R.string.MT_Protector;
                        break;
                    case 29:
                        i = R.string.MT_Protector;
                        break;
                    case 30:
                        i = R.string.MT_Protector;
                        break;
                    case 31:
                        i = R.string.MT_Protector;
                        break;
                    case 32:
                        i = R.string.MT_Protector;
                        break;
                    case 33:
                        i = R.string.MT_Protector;
                        break;
                    case 34:
                        i = R.string.MT_Protector;
                        break;
                    default:
                        i = 0;
                        break;
                }
                return i == 0 ? str : C21576.m49059(i, new Object[0]);
            }
        }
