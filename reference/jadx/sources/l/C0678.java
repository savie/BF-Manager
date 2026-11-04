package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֡᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0678 extends C2170 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18577 f2576;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m2930() {
        if (this.f2576 != null) {
            return true;
        }
        Cursor cursorQuery = C21576.m49091().query(C23053.m51956(mo42888()), new String[]{"mt_extras"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    this.f2576 = m2933(cursorQuery.getString(0));
                    cursorQuery.close();
                    return true;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    @Override // l.C2170, l.AbstractC2082
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2940(File file, Uri uri, boolean z) {
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo2945() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0678 mo2948() {
        return this;
    }

    @Override // l.C2170, l.AbstractC2082
    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo2949() {
        return true;
    }

    @Override // l.C2170, l.AbstractC2082, l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo2934() {
        if (this.f2576 != null) {
            return true;
        }
        return super.mo2934();
    }

    @Override // l.C2170, l.AbstractC2082, l.C22965
    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2952() {
        super.mo2952();
        this.f2576 = null;
    }

    @Override // l.C2170, l.AbstractC2082
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2082 mo2937(File file, Uri uri) {
        return new C0678(file, uri, m7465());
    }

    @Override // l.C2170, l.AbstractC2082
    /* JADX INFO: renamed from: ۙ */
    public final C2170 mo2937(File file, Uri uri) {
        return new C0678(file, uri, m7465());
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public final String[] mo2935() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified", "mt_extras", "mt_path"};
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo2939(File file, Uri uri, Cursor cursor) {
        C0678 c0678Mo2948 = super.mo2939(file, uri, cursor).mo2948();
        if (!cursor.isNull(5)) {
            c0678Mo2948.f2576 = m2933(cursor.getString(5));
        }
        return c0678Mo2948;
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public final String[] mo2953() {
        return new String[]{"mime_type", "_size", "last_modified", "mt_path", "mt_extras"};
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1907 mo2936(Cursor cursor) {
        return m2925(cursor, 0, 1, 2, 4);
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1907 mo2955(Cursor cursor) {
        return m2925(cursor, 2, 3, 4, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1907 m2925(Cursor cursor, int i, int i2, int i3, int i4) throws IOException {
        EnumC13093 enumC13093;
        long j = cursor.isNull(i2) ? -1L : cursor.getLong(i2);
        long j2 = cursor.isNull(i3) ? -1L : cursor.getLong(i3);
        if (m2956()) {
            return new C1907(this, EnumC13093.DIRECTORY, -1L, j2, null);
        }
        boolean zIsNull = cursor.isNull(i4);
        File file = this.f6914;
        if (!zIsNull) {
            try {
                C18577 c18577M2933 = m2933(cursor.getString(i4));
                char cM43156 = c18577M2933.m43156();
                if (cM43156 == '-') {
                    enumC13093 = EnumC13093.REGULAR;
                } else if (cM43156 == 'd') {
                    enumC13093 = EnumC13093.DIRECTORY;
                } else if (cM43156 == 'l') {
                    enumC13093 = EnumC13093.LINK;
                } else {
                    enumC13093 = EnumC13093.OTHER;
                }
                EnumC13093 enumC13094 = enumC13093;
                EnumC13093 enumC13095 = EnumC13093.LINK;
                if (enumC13094 == enumC13095 && c18577M2933.m43153() == null) {
                    throw new IOException("Missing MT provider link target: " + file.getPath());
                }
                return new C1907(this, enumC13094, enumC13094 == EnumC13093.DIRECTORY ? -1L : j, j2, enumC13094 == enumC13095 ? c18577M2933.m43153() : null);
            } catch (RuntimeException e) {
                throw new IOException("Invalid MT provider metadata: " + file.getPath(), e);
            }
        }
        if (this.f7148) {
            return m7164(cursor, i, i2, i3);
        }
        throw new IOException("Missing MT provider metadata: " + file.getPath());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C18577 m2933(String str) {
        String[] strArrSplit = str.split("\\|", 4);
        return new C18577(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), strArrSplit.length == 4 ? strArrSplit[3] : null);
    }

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m2956() {
        C25291 c25291M7465 = m7465();
        File file = this.f6914;
        String path = file.getParentFile().getPath();
        if (path.length() != 18 ? false : path.equalsIgnoreCase(c25291M7465.m56469())) {
            String name = file.getName();
            name.getClass();
            switch (name) {
                case "user_de_data":
                case "android_data":
                case "data":
                case "android_obb":
                    return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2942(long j) {
        Uri uriMo42888 = mo42888();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo42888);
        bundle.putLong("time", j);
        Bundle bundleCall = C21576.m49091().call(uriMo42888, "mt:setLastModified", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(o.c)) {
            C5811 c5811 = this.f6916;
            if (c5811 == null) {
                return true;
            }
            c5811.f19983 = j;
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18555 mo2938(InterfaceC21539 interfaceC21539) {
        return new C21561(this, this, interfaceC21539);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2941(int i) {
        Uri uriMo42888 = mo42888();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo42888);
        bundle.putInt("permissions", i);
        Bundle bundleCall = C21576.m49091().call(uriMo42888, "mt:setPermissions", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(o.c)) {
            C18577 c18577 = this.f2576;
            if (c18577 == null) {
                return true;
            }
            c18577.f60356 = i | (c18577.f60356 & (-4096));
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public final String m2944() {
        if (C22415.m50557()) {
            return (String) C22965.m51826(new CallableC4407(0, this), this.f6914.getPath(), 500);
        }
        return m2931();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public String m2931() {
        Cursor cursorQuery = C21576.m49091().query(C23053.m51956(mo42888()), new String[]{"mt_path"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    String string = cursorQuery.getString(0);
                    cursorQuery.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return this.f6914.getPath();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String mo2954() {
        if (m2956()) {
            return m2944();
        }
        m2950();
        C18577 c18577 = this.f2576;
        if (c18577 != null) {
            return c18577.f60357;
        }
        return null;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo2943() {
        return C14584.m35193(m2944(), new String[0]).m49856();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final String mo2951() {
        return m49860() ? m49852() : m2944();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo2946(final String str) throws IOException {
        if (C22415.m50557()) {
            C22965.m51825(new Callable() { // from class: l.ܰ᩶ᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f48544.m2929(str);
                    return null;
                }
            });
        } else {
            m2929(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m2929(String str) throws IOException {
        Uri uriMo42888 = mo42888();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo42888);
        bundle.putString(MotionUtils.EASING_TYPE_PATH, str);
        Bundle bundleCall = C21576.m49091().call(uriMo42888, "mt:createSymlink", (String) null, bundle);
        if (bundleCall != null) {
            if (bundleCall.getBoolean(o.c)) {
                return;
            }
            String string = bundleCall.getString("message");
            if (string != null) {
                throw new IOException(string);
            }
        }
        throw new IOException("Unable to create link '" + this.f6914.getPath() + "' to '" + str + "'");
    }

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public final boolean m2950() {
        if (this.f2576 != null) {
            return true;
        }
        if (C22415.m50557()) {
            return ((Boolean) C22965.m51826(new CallableC24545(0, this), Boolean.FALSE, 500)).booleanValue();
        }
        return m2930();
    }

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public final C18577 m2947() {
        C18577 c18577 = this.f2576;
        C17359.requireNonNull(c18577);
        return c18577;
    }
}
