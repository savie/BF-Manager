package l;

import com.umeng.analytics.pro.o;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩷ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4YN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21004 {
    TYPE_HEADER_ITEM(0, 17, 4, "header_item"),
    TYPE_STRING_ID_ITEM(1, 0, 4, "string_id_item"),
    TYPE_TYPE_ID_ITEM(2, 1, 4, "type_id_item"),
    TYPE_PROTO_ID_ITEM(3, 2, 4, "proto_id_item"),
    TYPE_FIELD_ID_ITEM(4, 3, 4, "field_id_item"),
    TYPE_METHOD_ID_ITEM(5, 4, 4, "method_id_item"),
    TYPE_CLASS_DEF_ITEM(6, 5, 4, "class_def_item"),
    TYPE_MAP_LIST(4096, 16, 4, "map_list"),
    TYPE_TYPE_LIST(o.a.a, 6, 4, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(o.a.b, 7, 4, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(o.a.c, 8, 4, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, 9, 1, "class_data_item"),
    TYPE_CODE_ITEM(o.a.q, 10, 4, "code_item"),
    TYPE_STRING_DATA_ITEM(o.a.r, 11, 1, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(o.a.s, 12, 1, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(o.a.t, 13, 1, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(o.a.u, 14, 1, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, 15, 4, "annotations_directory_item");


    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final TreeMap f68393 = new TreeMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f68395;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f68396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f68397;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f68398;

    static {
        for (EnumC21004 enumC21004 : values()) {
            f68393.put(Integer.valueOf(enumC21004.f68398), enumC21004);
        }
    }

    EnumC21004(int i, int i2, int i3, String str) {
        this.f68398 = i;
        this.f68395 = i2;
        this.f68396 = i3;
        this.f68397 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21004 m47162(int i) {
        return (EnumC21004) f68393.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m47164() {
        return this.f68398 <= 4096;
    }
}
