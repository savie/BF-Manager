package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M6XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0219 f56114;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2800 f56115;

    public C17659(C2800 c2800) {
        C0219 c0219 = new C0219();
        this.f56115 = c2800;
        this.f56114 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12721 m41139(String str, String str2, boolean z) throws C12731 {
        C2800 c2800 = this.f56115;
        C3070 c3070M8504 = c2800.m8504();
        String strM8502 = C2800.m8502(str, c3070M8504, "sourcePath");
        String strM8503 = C2800.m8502(str2, c3070M8504, "destinationPath");
        if (strM8502.equals(strM8503)) {
            throw m41137("FILE_MOVE_FAILED", "Source and destination must identify different paths.", strM8502, strM8503, c3070M8504.f11560, "prepare", "same_path");
        }
        C11268 c11268M8506 = c2800.m8506(Arrays.asList(strM8502, strM8503));
        try {
            C12721 c12721M41133 = m41133(c3070M8504, strM8502, strM8503, z);
            c11268M8506.close();
            return c12721M41133;
        } catch (Throwable th) {
            try {
                c11268M8506.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12721 m41133(C3070 c3070, String str, String str2, boolean z) throws C12731 {
        C16954 c16954M39736;
        C0219 c0219 = this.f56114;
        String str3 = c3070.f11560;
        C2800 c2800 = this.f56115;
        AbstractC20745 abstractC20745M8508 = c2800.m8508(str);
        AbstractC20745 abstractC20745M8509 = c2800.m8508(str2);
        C5928 c5928M41132 = m41132(abstractC20745M8508);
        C5928 c5928M41133 = m41132(abstractC20745M8509);
        String str4 = c3070.f11560;
        int[] iArr = C0725.f3006;
        int i = iArr[c5928M41132.m16196().ordinal()];
        if (i == 3) {
            throw m41137("FILE_NOT_FOUND", "The source path does not exist.", str, str2, str4, "source_stat", "missing");
        }
        if (i == 4) {
            throw m41137("FILE_IS_SYMLINK", "Symbolic links cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "link");
        }
        if (i == 5) {
            throw m41137("FILE_UNSUPPORTED_TYPE", "The source node type cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "other");
        }
        String str5 = c3070.f11560;
        EnumC12279 enumC12279M16196 = c5928M41132.m16196();
        EnumC12279 enumC12279 = EnumC12279.DIRECTORY;
        if (enumC12279M16196 == enumC12279) {
            if (z) {
                throw m41137("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory moves require overwrite=false and never replace a target.", str, str2, str5, "prepare", "directory_overwrite_unsupported");
            }
            int i2 = iArr[c5928M41133.m16196().ordinal()];
            if (i2 == 1) {
                throw m41137("FILE_ALREADY_EXISTS", "The destination of a directory move must not already exist.", str, str2, str5, "destination_stat", "file");
            }
            if (i2 == 2) {
                throw m41137("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory merging is not supported by the generic file tool.", str, str2, str5, "destination_stat", "directory");
            }
            if (i2 == 4) {
                throw m41137("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
            }
            if (i2 == 5) {
                throw m41137("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
            }
        } else {
            if (!z && c5928M41133.m16196() != EnumC12279.MISSING) {
                throw m41137("FILE_ALREADY_EXISTS", "The destination already exists and overwrite is false.", str, str2, str5, "destination_stat", m41131(c5928M41133.m16196()));
            }
            if (z) {
                if (c5928M41133.m16196() == EnumC12279.LINK) {
                    throw m41137("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
                }
                if (c5928M41133.m16196() == EnumC12279.OTHER) {
                    throw m41137("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
                }
                if (c5928M41133.m16196() == enumC12279) {
                    throw m41137("FILE_NOT_REGULAR", "A regular file cannot replace a directory.", str, str2, str5, "destination_stat", "directory");
                }
            }
        }
        if (c5928M41132.m16196() == enumC12279 && C6370.m17477(str2, str)) {
            throw m41137("FILE_MOVE_INTO_DESCENDANT", "A directory cannot be moved into itself or one of its descendants.", str, str2, c3070.f11560, "prepare", "destination_is_descendant");
        }
        String strM41130 = m41130(str, str2, abstractC20745M8508, str3, "source");
        String strM41131 = m41130(str, str2, abstractC20745M8509, str3, "destination");
        c3070.m9207(strM41130);
        c3070.m9207(strM41131);
        String str6 = strM41131;
        m41135(str, str2, strM41130, c3070.f11560, "source");
        m41135(str, str2, str6, c3070.f11560, "destination");
        m41138(str, str2, abstractC20745M8508, c3070.f11560, "source_parent_links");
        m41138(str, str2, abstractC20745M8509, c3070.f11560, "destination_parent_links");
        EnumC17217 enumC17217 = c5928M41133.m16196() == EnumC12279.MISSING ? EnumC17217.RENAME_NO_REPLACE : EnumC17217.REPLACE;
        if (abstractC20745M8508.mo33989().mo1799(enumC17217) == EnumC16512.UNSUPPORTED) {
            throw m41137("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c3070.f11560, enumC17217.name().toLowerCase(Locale.ROOT), "unsupported");
        }
        while (true) {
            C3070 c3070M8504 = c2800.m8504();
            c3070M8504.m9207(str);
            String str7 = c3070M8504.f11560;
            c3070M8504.m9210(str);
            c3070M8504.m9207(str2);
            c3070M8504.m9210(str2);
            c3070M8504.m9207(strM41130);
            String str8 = str6;
            c3070M8504.m9207(str8);
            AbstractC20745 abstractC20745M85010 = c2800.m8508(str);
            AbstractC20745 abstractC20745M85011 = c2800.m8508(str2);
            C5928 c5928M41134 = m41132(abstractC20745M85010);
            C0219 c02110 = c0219;
            m41136(str, str2, c5928M41132, c5928M41133, c5928M41134, m41132(abstractC20745M85011), c3070M8504.f11560);
            m41135(str, str2, strM41130, c3070M8504.f11560, "source");
            m41135(str, str2, str8, c3070M8504.f11560, "destination");
            m41138(str, str2, abstractC20745M85010, c3070M8504.f11560, "source_parent_links");
            m41138(str, str2, abstractC20745M85011, c3070M8504.f11560, "destination_parent_links");
            if (c5928M41134.m16196() == EnumC12279.DIRECTORY) {
                ArrayDeque arrayDeque = new ArrayDeque();
                HashSet hashSet = new HashSet();
                arrayDeque.add(c5928M41134);
                while (!arrayDeque.isEmpty()) {
                    C5928 c5928 = (C5928) arrayDeque.removeFirst();
                    if (hashSet.add(m41129(c5928.m16195().mo33986(), str, str2, str7))) {
                        try {
                            for (C5928 c5929 : c5928.m16195().mo33989().mo27226(c5928)) {
                                String strM41129 = m41129(c5929.m16195().mo33986(), str, str2, str7);
                                StringBuilder sbM23356 = C9023.m23356(str2);
                                sbM23356.append(strM41129.substring(str.length()));
                                String string = sbM23356.toString();
                                HashSet hashSet2 = hashSet;
                                if (c5929.m16196() != EnumC12279.MISSING) {
                                    c3070M8504.m9207(strM41129);
                                    c3070M8504.m9207(string);
                                    int i3 = C0725.f3006[c5929.m16196().ordinal()];
                                    if (i3 == 2) {
                                        arrayDeque.addLast(c5929);
                                    } else if (i3 == 5) {
                                        throw m41137("FILE_UNSUPPORTED_TYPE", "A directory move cannot include an unsupported special node.", strM41129, string, c3070M8504.f11560, "source_tree", "other");
                                    }
                                }
                                hashSet = hashSet2;
                            }
                        } catch (C20040 e) {
                            throw C2800.m8500(e);
                        }
                    }
                }
            }
            C3070 c3070M8505 = c2800.m8504();
            if (str7.equals(c3070M8505.f11560)) {
                AbstractC20745 abstractC20745M85012 = c2800.m8508(str);
                AbstractC20745 abstractC20745M85013 = c2800.m8508(str2);
                m41136(str, str2, c5928M41132, c5928M41133, m41132(abstractC20745M85012), m41132(abstractC20745M85013), c3070M8505.f11560);
                m41135(str, str2, strM41130, c3070M8505.f11560, "source");
                m41135(str, str2, str8, c3070M8505.f11560, "destination");
                m41138(str, str2, abstractC20745M85012, c3070M8505.f11560, "source_parent_links");
                m41138(str, str2, abstractC20745M85013, c3070M8505.f11560, "destination_parent_links");
                AbstractC10868 abstractC10868Mo33989 = abstractC20745M85012.mo33989();
                EnumC16512 enumC16512Mo1799 = abstractC10868Mo33989.mo1799(enumC17217);
                if (enumC16512Mo1799 == EnumC16512.UNSUPPORTED) {
                    throw m41137("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c3070M8505.f11560, enumC17217.name().toLowerCase(Locale.ROOT), "unsupported");
                }
                String str9 = enumC16512Mo1799 == EnumC16512.ATOMIC ? "atomic" : "best_effort";
                JSONArray jSONArrayArray = JSON.array();
                try {
                    if (enumC17217 == EnumC17217.REPLACE) {
                        abstractC10868Mo33989.mo8396(abstractC20745M85013);
                    } else {
                        abstractC10868Mo33989.mo8391(abstractC20745M85013);
                    }
                    boolean z2 = c5928M41132.m16196() == EnumC12279.DIRECTORY;
                    try {
                        c02110.getClass();
                        C2664.m8195();
                        if (z2) {
                            C22252.m49410(str);
                            C22252.m49408(str2, false);
                        } else {
                            C22252.m49404(str);
                            C22252.m49408(str2, true);
                        }
                        C11838.m29532();
                    } catch (RuntimeException unused) {
                        jSONArrayArray.add("File move notification could not be completed.");
                    }
                    return new C12721(new JSONArray(jSONArrayArray), str, str2, m41131(c5928M41132.m16196()));
                } catch (C20040 e2) {
                    if (enumC16512Mo1799 == EnumC16512.ATOMIC) {
                        c16954M39736 = C16954.m39737(false);
                    } else {
                        EnumC12279 enumC12279M16197 = c5928M41132.m16196();
                        try {
                            AbstractC20745 abstractC20745M85014 = c2800.m8508(str);
                            AbstractC20745 abstractC20745M85015 = c2800.m8508(str2);
                            EnumC12279 enumC12279M16198 = abstractC20745M85014.mo33989().mo8394().m16196();
                            EnumC12279 enumC12279M16199 = abstractC20745M85015.mo33989().mo8394().m16196();
                            EnumC12279 enumC122710 = EnumC12279.MISSING;
                            c16954M39736 = (enumC12279M16198 == enumC122710 && enumC12279M16199 == enumC12279M16197) ? C16954.m39737(true) : (enumC17217 == EnumC17217.RENAME_NO_REPLACE && enumC12279M16198 == enumC12279M16197 && enumC12279M16199 == enumC122710) ? C16954.m39737(false) : C16954.m39736();
                        } catch (RuntimeException | C20040 unused2) {
                            c16954M39736 = C16954.m39736();
                        }
                    }
                    boolean z3 = c16954M39736.f54248;
                    boolean z4 = c16954M39736.f54247;
                    boolean z5 = c5928M41132.m16196() == EnumC12279.DIRECTORY;
                    if (z4 || !z3) {
                        try {
                            c02110.getClass();
                            C2664.m8195();
                            if (z5) {
                                C22252.m49410(str);
                                C22252.m49408(str2, false);
                            } else {
                                C22252.m49404(str);
                                C22252.m49408(str2, true);
                            }
                            C11838.m29532();
                        } catch (RuntimeException unused3) {
                            jSONArrayArray.add("File move notification could not be completed.");
                        }
                    }
                    if (!z4 && z3 && (e2.m45399() == EnumC15807.CROSS_BACKEND || e2.m45399() == EnumC15807.UNSUPPORTED)) {
                        String str10 = c3070M8505.f11560;
                        String strName = e2.m45399().name();
                        Locale locale = Locale.ROOT;
                        throw C12731.m31631("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", "fatal", null, m41128(str, str2, str10, enumC17217.name().toLowerCase(locale), strName.toLowerCase(locale), false, str9, true, jSONArrayArray));
                    }
                    String str11 = c3070M8505.f11560;
                    String strName2 = e2.m45399().name();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase = strName2.toLowerCase(locale2);
                    boolean z6 = c16954M39736.f54247;
                    boolean z7 = c16954M39736.f54248;
                    throw C12731.m31627(z7 ? "FILE_MOVE_FAILED" : "FILE_OPERATION_STATE_UNKNOWN", z7 ? "The direct file move failed." : "The direct file move failed and its final state is unknown.", "warning", (JSONArray) null, m41128(str, str2, str11, enumC17217.name().toLowerCase(locale2), lowerCase, z6, str9, z7, jSONArrayArray));
                }
            }
            c0219 = c02110;
            str6 = str8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41130(String str, String str2, AbstractC20745 abstractC20745, String str3, String str4) throws C12731 {
        String parent = abstractC20745.getParent();
        if (parent != null) {
            return parent;
        }
        throw m41137("FILE_PARENT_NOT_FOUND", C16523.m38890("The ", str4, " path has no parent directory."), str, str2, str3, str4.concat("_parent_stat"), "parent_missing");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41135(String str, String str2, String str3, String str4, String str5) throws C12731 {
        C5928 c5928M41132 = m41132(this.f56115.m8508(str3));
        if (c5928M41132.m16196() == EnumC12279.MISSING) {
            throw m41137("FILE_PARENT_NOT_FOUND", C16523.m38890("The ", str5, " parent directory does not exist."), str, str2, str4, str5.concat("_parent_stat"), "missing");
        }
        if (c5928M41132.m16196() == EnumC12279.LINK) {
            throw m41137("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", str, str2, str4, str5.concat("_parent_stat"), "parent_is_link");
        }
        if (c5928M41132.m16196() != EnumC12279.DIRECTORY) {
            throw m41137("FILE_NOT_DIRECTORY", C16523.m38890("The ", str5, " parent is not a directory."), str, str2, str4, str5.concat("_parent_stat"), m41131(c5928M41132.m16196()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41129(String str, String str2, String str3, String str4) throws C12731 {
        try {
            String strM17479 = C6370.m17479(str, "sourcePath");
            if (C6370.m17477(strM17479, str2)) {
                return strM17479;
            }
            throw m41137("FILE_MOVE_FAILED", "The storage backend returned an entry outside the source directory.", str2, str3, str4, "source_tree", "entry_outside_source");
        } catch (C12731 unused) {
            throw m41137("FILE_MOVE_FAILED", "The storage backend returned an invalid directory entry path.", str2, str3, str4, "source_tree", "invalid_entry_path");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m41138(final String str, final String str2, AbstractC20745 abstractC20745, final String str3, final String str4) throws C12731 {
        this.f56115.m8507(abstractC20745, new InterfaceC11974() { // from class: l.᩶᩺۬
            @Override // l.InterfaceC11974
            /* JADX INFO: renamed from: ۙ */
            public final C12731 mo15512(String str5, String str6, String str7) {
                return C17659.m41134(str, str2, str3, str4, str5, str6, str7);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C12731 m41134(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        String str10;
        if (!"parent_missing".equals(str7) && !"ancestor_missing".equals(str7)) {
            if (!"FILE_NOT_DIRECTORY".equals(str5)) {
                str8 = str5;
                str10 = str6;
                str9 = str7;
            }
            return m41137(str8, str10, str, str2, str3, str4, str9);
        }
        str5 = "FILE_LINK_CHECK_FAILED";
        str7 = "missing";
        str8 = str5;
        str9 = str7;
        str10 = "The existing parent chain could not be verified safely.";
        return m41137(str8, str10, str, str2, str3, str4, str9);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41136(String str, String str2, C5928 c5928, C5928 c5929, C5928 c59210, C5928 c59211, String str3) throws C12731 {
        if (c5928.m16196() != c59210.m16196() || c5929.m16196() != c59211.m16196()) {
            throw m41137("FILE_MOVE_FAILED", "A source or destination node changed during move validation.", str, str2, str3, "pre_move_stat", "node_type_changed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5928 m41132(AbstractC20745 abstractC20745) throws C12731 {
        try {
            return abstractC20745.mo33989().mo8394();
        } catch (C20040 e) {
            this.f56115.getClass();
            throw C2800.m8500(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41131(EnumC12279 enumC12279) {
        int i = C0725.f3006[enumC12279.ordinal()];
        if (i == 1) {
            return "file";
        }
        if (i == 2) {
            return "directory";
        }
        if (i == 3) {
            return "missing";
        }
        if (i == 4) {
            return "link";
        }
        if (i == 5) {
            return "other";
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m41137(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObjectM41128 = m41128(str3, str4, str5, str6, str7, false, null, true, JSON.array());
        if (("FILE_NOT_FOUND".equals(str) && "source_stat".equals(str6) && "missing".equals(str7)) || (("FILE_NOT_REGULAR".equals(str) && "destination_stat".equals(str6) && "directory".equals(str7)) || ((("source_parent_stat".equals(str6) || "destination_parent_stat".equals(str6)) && (("FILE_PARENT_NOT_FOUND".equals(str) && "missing".equals(str7)) || ("FILE_NOT_DIRECTORY".equals(str) && "file".equals(str7)))) || "FILE_ALREADY_EXISTS".equals(str)))) {
            return C12731.m31627(str, str2, "warning", (JSONArray) null, jSONObjectM41128);
        }
        return C12731.m31631(str, str2, "fatal", null, jSONObjectM41128);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41128(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, JSONArray jSONArray) {
        return C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "targetPath", str2).add("policyRevision", str3).add("operation", str4).add("backendReason", str5).add("changed", z).add("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
    }
}
