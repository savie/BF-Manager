package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18369 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13921 f59853;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f59854;

    public C18369(C22209 c22209) {
        C13921 c13921 = new C13921(1);
        C17359.requireNonNull(c22209, "support");
        this.f59854 = c22209;
        this.f59853 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21353 m42845(String str, String str2, boolean z) throws C10186 {
        C22209 c22209 = this.f59854;
        C9113 c9113M50227 = c22209.m50227();
        String strM50226 = C22209.m50226(str, c9113M50227, "sourcePath");
        String strM50227 = C22209.m50226(str2, c9113M50227, "destinationPath");
        if (strM50226.equals(strM50227)) {
            throw m42843("FILE_MOVE_FAILED", "Source and destination must identify different paths.", strM50226, strM50227, c9113M50227.f29602, "prepare", "same_path");
        }
        C19225 c19225M50229 = c22209.m50229(Arrays.asList(strM50226, strM50227));
        try {
            C21353 c21353M42840 = m42840(c9113M50227, strM50226, strM50227, z);
            c19225M50229.close();
            return c21353M42840;
        } catch (Throwable th) {
            try {
                c19225M50229.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21353 m42840(C9113 c9113, String str, String str2, boolean z) throws C10186 {
        C14639 c14639M35272;
        C13921 c13921 = this.f59853;
        String str3 = c9113.f29602;
        C22209 c22209 = this.f59854;
        AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
        AbstractC22044 abstractC22044M50233 = c22209.m50232(str2);
        C1907 c1907M42838 = m42838(abstractC22044M50232);
        C1907 c1907M42839 = m42838(abstractC22044M50233);
        String str4 = c9113.f29602;
        int[] iArr = C4199.f15347;
        int i = iArr[c1907M42838.m6567().ordinal()];
        if (i == 3) {
            throw m42843("FILE_NOT_FOUND", "The source path does not exist.", str, str2, str4, "source_stat", "missing");
        }
        if (i == 4) {
            throw m42843("FILE_IS_SYMLINK", "Symbolic links cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "link");
        }
        if (i == 5) {
            throw m42843("FILE_UNSUPPORTED_TYPE", "The source node type cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "other");
        }
        String str5 = c9113.f29602;
        EnumC13093 enumC13093M6567 = c1907M42838.m6567();
        EnumC13093 enumC13093 = EnumC13093.DIRECTORY;
        if (enumC13093M6567 == enumC13093) {
            if (z) {
                throw m42843("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory moves require overwrite=false and never replace a target.", str, str2, str5, "prepare", "directory_overwrite_unsupported");
            }
            int i2 = iArr[c1907M42839.m6567().ordinal()];
            if (i2 == 1) {
                throw m42843("FILE_ALREADY_EXISTS", "The destination of a directory move must not already exist.", str, str2, str5, "destination_stat", "file");
            }
            if (i2 == 2) {
                throw m42843("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory merging is not supported by the generic file tool.", str, str2, str5, "destination_stat", "directory");
            }
            if (i2 == 4) {
                throw m42843("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
            }
            if (i2 == 5) {
                throw m42843("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
            }
        } else {
            if (!z && c1907M42839.m6567() != EnumC13093.MISSING) {
                throw m42843("FILE_ALREADY_EXISTS", "The destination already exists and overwrite is false.", str, str2, str5, "destination_stat", m42837(c1907M42839.m6567()));
            }
            if (z) {
                if (c1907M42839.m6567() == EnumC13093.LINK) {
                    throw m42843("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
                }
                if (c1907M42839.m6567() == EnumC13093.OTHER) {
                    throw m42843("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
                }
                if (c1907M42839.m6567() == enumC13093) {
                    throw m42843("FILE_NOT_REGULAR", "A regular file cannot replace a directory.", str, str2, str5, "destination_stat", "directory");
                }
            }
        }
        if (c1907M42838.m6567() == enumC13093 && C0470.m2302(str2, str)) {
            throw m42843("FILE_MOVE_INTO_DESCENDANT", "A directory cannot be moved into itself or one of its descendants.", str, str2, c9113.f29602, "prepare", "destination_is_descendant");
        }
        String strM42836 = m42836(str, str2, abstractC22044M50232, str3, "source");
        String strM42837 = m42836(str, str2, abstractC22044M50233, str3, "destination");
        c9113.m24270(strM42836);
        c9113.m24270(strM42837);
        String str6 = strM42837;
        m42841(str, str2, strM42836, c9113.f29602, "source");
        m42841(str, str2, str6, c9113.f29602, "destination");
        m42844(str, str2, abstractC22044M50232, c9113.f29602, "source_parent_links");
        m42844(str, str2, abstractC22044M50233, c9113.f29602, "destination_parent_links");
        EnumC5636 enumC5636 = c1907M42839.m6567() == EnumC13093.MISSING ? EnumC5636.RENAME_NO_REPLACE : EnumC5636.REPLACE;
        if (abstractC22044M50232.mo4298().mo8788(enumC5636) == EnumC15330.UNSUPPORTED) {
            throw m42843("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c9113.f29602, enumC5636.name().toLowerCase(Locale.ROOT), "unsupported");
        }
        while (true) {
            C9113 c9113M50227 = c22209.m50227();
            c9113M50227.m24270(str);
            String str7 = c9113M50227.f29602;
            c9113M50227.m24269(str);
            c9113M50227.m24270(str2);
            c9113M50227.m24269(str2);
            c9113M50227.m24270(strM42836);
            String str8 = str6;
            c9113M50227.m24270(str8);
            AbstractC22044 abstractC22044M50234 = c22209.m50232(str);
            AbstractC22044 abstractC22044M50235 = c22209.m50232(str2);
            C1907 c1907M428310 = m42838(abstractC22044M50234);
            C13921 c13922 = c13921;
            m42842(str, str2, c1907M42838, c1907M42839, c1907M428310, m42838(abstractC22044M50235), c9113M50227.f29602);
            m42841(str, str2, strM42836, c9113M50227.f29602, "source");
            m42841(str, str2, str8, c9113M50227.f29602, "destination");
            m42844(str, str2, abstractC22044M50234, c9113M50227.f29602, "source_parent_links");
            m42844(str, str2, abstractC22044M50235, c9113M50227.f29602, "destination_parent_links");
            if (c1907M428310.m6567() == EnumC13093.DIRECTORY) {
                ArrayDeque arrayDeque = new ArrayDeque();
                HashSet hashSet = new HashSet();
                arrayDeque.add(c1907M428310);
                while (!arrayDeque.isEmpty()) {
                    C1907 c1907 = (C1907) arrayDeque.removeFirst();
                    if (hashSet.add(m42835(c1907.m6565().mo4294(), str, str2, str7))) {
                        try {
                            for (C1907 c1908 : c1907.m6565().mo4298().mo29161(c1907)) {
                                String strM42835 = m42835(c1908.m6565().mo4294(), str, str2, str7);
                                StringBuilder sbM27333 = C10732.m27333(str2);
                                sbM27333.append(strM42835.substring(str.length()));
                                String string = sbM27333.toString();
                                HashSet hashSet2 = hashSet;
                                if (c1908.m6567() != EnumC13093.MISSING) {
                                    c9113M50227.m24270(strM42835);
                                    c9113M50227.m24270(string);
                                    int i3 = C4199.f15347[c1908.m6567().ordinal()];
                                    if (i3 == 2) {
                                        arrayDeque.addLast(c1908);
                                    } else if (i3 == 5) {
                                        throw m42843("FILE_UNSUPPORTED_TYPE", "A directory move cannot include an unsupported special node.", strM42835, string, c9113M50227.f29602, "source_tree", "other");
                                    }
                                }
                                hashSet = hashSet2;
                            }
                        } catch (C22790 e) {
                            throw C22209.m50224(e);
                        }
                    }
                }
            }
            C9113 c9113M50228 = c22209.m50227();
            if (str7.equals(c9113M50228.f29602)) {
                AbstractC22044 abstractC22044M50236 = c22209.m50232(str);
                AbstractC22044 abstractC22044M50237 = c22209.m50232(str2);
                m42842(str, str2, c1907M42838, c1907M42839, m42838(abstractC22044M50236), m42838(abstractC22044M50237), c9113M50228.f29602);
                m42841(str, str2, strM42836, c9113M50228.f29602, "source");
                m42841(str, str2, str8, c9113M50228.f29602, "destination");
                m42844(str, str2, abstractC22044M50236, c9113M50228.f29602, "source_parent_links");
                m42844(str, str2, abstractC22044M50237, c9113M50228.f29602, "destination_parent_links");
                AbstractC11601 abstractC11601Mo4298 = abstractC22044M50236.mo4298();
                EnumC15330 enumC15330Mo8788 = abstractC11601Mo4298.mo8788(enumC5636);
                if (enumC15330Mo8788 == EnumC15330.UNSUPPORTED) {
                    throw m42843("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c9113M50228.f29602, enumC5636.name().toLowerCase(Locale.ROOT), "unsupported");
                }
                String str9 = enumC15330Mo8788 == EnumC15330.ATOMIC ? "atomic" : "best_effort";
                JSONArray jSONArrayArray = JSON.array();
                try {
                    if (enumC5636 == EnumC5636.REPLACE) {
                        abstractC11601Mo4298.mo8795(abstractC22044M50237);
                    } else {
                        abstractC11601Mo4298.mo8789(abstractC22044M50237);
                    }
                    boolean z2 = c1907M42838.m6567() == EnumC13093.DIRECTORY;
                    try {
                        c13922.getClass();
                        AbstractC11810.m29655();
                        if (z2) {
                            C20108.m46237(str);
                            C20108.m46233(str2, false);
                        } else {
                            C20108.m46239(str);
                            C20108.m46233(str2, true);
                        }
                        C20081.m46203();
                    } catch (RuntimeException unused) {
                        jSONArrayArray.add("File move notification could not be completed.");
                    }
                    return new C21353(new JSONArray(jSONArrayArray), str, str2, m42837(c1907M42838.m6567()));
                } catch (C22790 e2) {
                    if (enumC15330Mo8788 == EnumC15330.ATOMIC) {
                        c14639M35272 = C14639.m35273(false);
                    } else {
                        EnumC13093 enumC13093M6568 = c1907M42838.m6567();
                        try {
                            AbstractC22044 abstractC22044M50238 = c22209.m50232(str);
                            AbstractC22044 abstractC22044M50239 = c22209.m50232(str2);
                            EnumC13093 enumC13093M6569 = abstractC22044M50238.mo4298().mo8790().m6567();
                            EnumC13093 enumC13093M65610 = abstractC22044M50239.mo4298().mo8790().m6567();
                            EnumC13093 enumC13094 = EnumC13093.MISSING;
                            c14639M35272 = (enumC13093M6569 == enumC13094 && enumC13093M65610 == enumC13093M6568) ? C14639.m35273(true) : (enumC5636 == EnumC5636.RENAME_NO_REPLACE && enumC13093M6569 == enumC13093M6568 && enumC13093M65610 == enumC13094) ? C14639.m35273(false) : C14639.m35272();
                        } catch (RuntimeException | C22790 unused2) {
                            c14639M35272 = C14639.m35272();
                        }
                    }
                    boolean z3 = c14639M35272.f47907;
                    boolean z4 = c14639M35272.f47906;
                    boolean z5 = c1907M42838.m6567() == EnumC13093.DIRECTORY;
                    if (z4 || !z3) {
                        try {
                            c13922.getClass();
                            AbstractC11810.m29655();
                            if (z5) {
                                C20108.m46237(str);
                                C20108.m46233(str2, false);
                            } else {
                                C20108.m46239(str);
                                C20108.m46233(str2, true);
                            }
                            C20081.m46203();
                        } catch (RuntimeException unused3) {
                            jSONArrayArray.add("File move notification could not be completed.");
                        }
                    }
                    if (!z4 && z3 && (e2.m51409() == EnumC10855.CROSS_BACKEND || e2.m51409() == EnumC10855.UNSUPPORTED)) {
                        String str10 = c9113M50228.f29602;
                        String strName = e2.m51409().name();
                        Locale locale = Locale.ROOT;
                        throw C10186.m26306("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", "fatal", null, m42834(str, str2, str10, enumC5636.name().toLowerCase(locale), strName.toLowerCase(locale), false, str9, true, jSONArrayArray));
                    }
                    String str11 = c9113M50228.f29602;
                    String strName2 = e2.m51409().name();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase = strName2.toLowerCase(locale2);
                    boolean z6 = c14639M35272.f47906;
                    boolean z7 = c14639M35272.f47907;
                    throw C10186.m26302(z7 ? "FILE_MOVE_FAILED" : "FILE_OPERATION_STATE_UNKNOWN", z7 ? "The direct file move failed." : "The direct file move failed and its final state is unknown.", "warning", (JSONArray) null, m42834(str, str2, str11, enumC5636.name().toLowerCase(locale2), lowerCase, z6, str9, z7, jSONArrayArray));
                }
            }
            c13921 = c13922;
            str6 = str8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42836(String str, String str2, AbstractC22044 abstractC22044, String str3, String str4) throws C10186 {
        String parent = abstractC22044.getParent();
        if (parent != null) {
            return parent;
        }
        throw m42843("FILE_PARENT_NOT_FOUND", C14442.m34865("The ", str4, " path has no parent directory."), str, str2, str3, str4.concat("_parent_stat"), "parent_missing");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42841(String str, String str2, String str3, String str4, String str5) throws C10186 {
        C1907 c1907M42838 = m42838(this.f59854.m50232(str3));
        if (c1907M42838.m6567() == EnumC13093.MISSING) {
            throw m42843("FILE_PARENT_NOT_FOUND", C14442.m34865("The ", str5, " parent directory does not exist."), str, str2, str4, str5.concat("_parent_stat"), "missing");
        }
        if (c1907M42838.m6567() == EnumC13093.LINK) {
            throw m42843("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", str, str2, str4, str5.concat("_parent_stat"), "parent_is_link");
        }
        if (c1907M42838.m6567() != EnumC13093.DIRECTORY) {
            throw m42843("FILE_NOT_DIRECTORY", C14442.m34865("The ", str5, " parent is not a directory."), str, str2, str4, str5.concat("_parent_stat"), m42837(c1907M42838.m6567()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42835(String str, String str2, String str3, String str4) throws C10186 {
        try {
            String strM2304 = C0470.m2304(str, "sourcePath");
            if (C0470.m2302(strM2304, str2)) {
                return strM2304;
            }
            throw m42843("FILE_MOVE_FAILED", "The storage backend returned an entry outside the source directory.", str2, str3, str4, "source_tree", "entry_outside_source");
        } catch (C10186 unused) {
            throw m42843("FILE_MOVE_FAILED", "The storage backend returned an invalid directory entry path.", str2, str3, str4, "source_tree", "invalid_entry_path");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42844(final String str, final String str2, AbstractC22044 abstractC22044, final String str3, final String str4) throws C10186 {
        this.f59854.m50231(abstractC22044, new InterfaceC5055() { // from class: l.᩺ܰۚ
            @Override // l.InterfaceC5055
            /* JADX INFO: renamed from: ۙ */
            public final C10186 mo15291(String str5, String str6, String str7) {
                return C18369.m42839(str, str2, str3, str4, str5, str6, str7);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C10186 m42839(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        String str10;
        if (!"parent_missing".equals(str7) && !"ancestor_missing".equals(str7)) {
            if (!"FILE_NOT_DIRECTORY".equals(str5)) {
                str8 = str5;
                str10 = str6;
                str9 = str7;
            }
            return m42843(str8, str10, str, str2, str3, str4, str9);
        }
        str5 = "FILE_LINK_CHECK_FAILED";
        str7 = "missing";
        str8 = str5;
        str9 = str7;
        str10 = "The existing parent chain could not be verified safely.";
        return m42843(str8, str10, str, str2, str3, str4, str9);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42842(String str, String str2, C1907 c1907, C1907 c1908, C1907 c1909, C1907 c19010, String str3) throws C10186 {
        if (c1907.m6567() != c1909.m6567() || c1908.m6567() != c19010.m6567()) {
            throw m42843("FILE_MOVE_FAILED", "A source or destination node changed during move validation.", str, str2, str3, "pre_move_stat", "node_type_changed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1907 m42838(AbstractC22044 abstractC22044) throws C10186 {
        try {
            return abstractC22044.mo4298().mo8790();
        } catch (C22790 e) {
            this.f59854.getClass();
            throw C22209.m50224(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42837(EnumC13093 enumC13093) {
        int i = C4199.f15347[enumC13093.ordinal()];
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m42843(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObjectM42834 = m42834(str3, str4, str5, str6, str7, false, null, true, JSON.array());
        if (("FILE_NOT_FOUND".equals(str) && "source_stat".equals(str6) && "missing".equals(str7)) || (("FILE_NOT_REGULAR".equals(str) && "destination_stat".equals(str6) && "directory".equals(str7)) || ((("source_parent_stat".equals(str6) || "destination_parent_stat".equals(str6)) && (("FILE_PARENT_NOT_FOUND".equals(str) && "missing".equals(str7)) || ("FILE_NOT_DIRECTORY".equals(str) && "file".equals(str7)))) || "FILE_ALREADY_EXISTS".equals(str)))) {
            return C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObjectM42834);
        }
        return C10186.m26306(str, str2, "fatal", null, jSONObjectM42834);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42834(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, JSONArray jSONArray) {
        return C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "targetPath", str2).add("policyRevision", str3).add("operation", str4).add("backendReason", str5).add("changed", z).add("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
    }
}
