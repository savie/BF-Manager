package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6167 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21005 = 0;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21006 = C6382.f21568.m49876("tran3");

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C19987 f21007;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f21008;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public View f21009;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public String f21010;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C19023 f21012;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f21013;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f21011 = new ArrayList();

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f21014 = new HashMap();

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ArscTranslationMain";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40415();
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC23938(this, 1));
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C17353 c17353 = new C17353(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c17353);
        C19987 c19987 = (C19987) m40418(android.R.id.list);
        this.f21007 = c19987;
        c19987.setFastScrollEnabled(true);
        this.f21007.setOnItemClickListener(this);
        this.f21009 = m40418(R.id.MT_Protector);
        C19023 c19023 = (C19023) m40418(R.id.MT_Protector);
        this.f21012 = c19023;
        c19023.setChecked(ApplicationC17729.f58258.getBoolean("arsc_translation_keep", true));
        this.f21012.setOnCheckedChangeListener(new C12878());
        if (C14584.m35199(this)) {
            return;
        }
        this.f21008 = C14584.m35190(getIntent());
        if (bundle != null && bundle.getBoolean("stateOK")) {
            try {
                this.f21010 = bundle.getString("digest");
                this.f21013 = bundle.getBoolean("changed");
                ArrayList<String> stringArrayList = bundle.getStringArrayList("filePaths");
                C17359.requireNonNull(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = this.f21011;
                    if (zHasNext) {
                        C24067 c24067 = new C24067(C14584.m35193(it.next(), new String[0]));
                        String strM53623 = c24067.m53623();
                        arrayList.add(strM53623);
                        this.f21014.put(strM53623, c24067);
                    } else {
                        Collections.sort(arrayList);
                        this.f21007.setAdapter((ListAdapter) new C3183(this));
                        return;
                    }
                }
            } catch (Exception e) {
                m40402((Throwable) e, true);
            }
        } else {
            new C16607(this).m8197();
        }
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f21010;
        if (str == null) {
            return;
        }
        bundle.putString("digest", str);
        bundle.putBoolean("changed", this.f21013);
        HashMap map = this.f21014;
        ArrayList<String> arrayList = new ArrayList<>(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((C24067) it.next()).m53616().mo4294());
        }
        bundle.putStringArrayList("filePaths", arrayList);
        bundle.putBoolean("stateOK", true);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f21010 == null) {
            return;
        }
        Iterator it = this.f21014.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                ((C24067) it.next()).m53619();
            } catch (IOException e) {
                m40401(e, (DialogInterface.OnDismissListener) null);
                z = true;
            }
        }
        if (z) {
            this.f21013 = false;
        } else {
            this.f21013 = this.f21013 || !this.f21010.equals(m17762());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String m17762() {
        MessageDigest messageDigestM36174 = C15022.m36174();
        Iterator it = this.f21014.values().iterator();
        while (it.hasNext()) {
            ((C24067) it.next()).m53617(messageDigestM36174);
        }
        return C15022.m36182(messageDigestM36174.digest());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            new C15861(this, false).m8197();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m17769();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f21009.getVisibility() == 0) {
                this.f21009.setVisibility(8);
                return true;
            }
            this.f21009.setVisibility(0);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId != R.id.MT_Protector) {
                return false;
            }
            if (C18978.m44079()) {
                startActivity(new Intent(this, (Class<?>) ActivityC24449.class));
                return true;
            }
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
        ArrayList arrayList = this.f21011;
        if (arrayList.size() < 2) {
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
        C22673.m51152(R.string.MT_Protector);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        boolean[] zArr = new boolean[strArr.length];
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8015(strArr, zArr, new DialogInterfaceOnMultiChoiceClickListenerC21378(zArr, 1));
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new ViewOnClickListenerC2703(this, zArr, strArr, dialogInterfaceC8327M34866, 1));
        return true;
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m17769();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public void m17769() {
        if (this.f21013) {
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴۙ᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC6167.f21005;
                    new C15861(this.f63168, true).m8197();
                }
            });
            c2361.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۙ᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC6167.f21005;
                    this.f49328.finish();
                }
            });
            c2361.m8016();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        f21006.mo4296();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent(this, (Class<?>) ActivityC13873.class);
        C24067 c24067 = (C24067) this.f21014.get(this.f21011.get(i));
        C17359.requireNonNull(c24067);
        intent.setData(c24067.m53616().m49836());
        startActivity(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17759(final ActivityC6167 activityC6167, boolean[] zArr, String[] strArr, DialogInterfaceC8327 dialogInterfaceC8327) {
        HashMap map = activityC6167.f21014;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            if (zArr[i3]) {
                if (i == -1) {
                    i = i3;
                } else {
                    if (i2 != -1) {
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    i2 = i3;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        final C24067<C3929> c24067 = (C24067) map.get(strArr[i]);
        C17359.requireNonNull(c24067);
        final C24067<C3929> c24068 = (C24067) map.get(strArr[i2]);
        C17359.requireNonNull(c24068);
        HashMap map2 = new HashMap();
        for (C3929 c3929 : c24067) {
            C21829 c21829 = new C21829(c3929.f13415, c3929.f13417);
            String str = c3929.f13419;
            if (str == null) {
                str = c3929.f13418;
            }
            map2.put(c21829, new C12132(str));
        }
        for (C3929 c39210 : c24068) {
            C12132 c12132 = (C12132) map2.get(new C21829(c39210.f13415, c39210.f13417));
            if (c12132 != null) {
                String str2 = c39210.f13419;
                if (str2 == null) {
                    str2 = c39210.f13418;
                }
                c12132.f39018 = str2;
            }
        }
        final C12132[] c12132Arr = (C12132[]) C1170.stream(map2.values()).filter(new C5421()).toArray(new C1692());
        if (c12132Arr.length == 0) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        dialogInterfaceC8327.dismiss();
        C2361 c2361BuildDialog = activityC6167.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(c24067.m53623() + " > " + c24068.m53623());
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        final DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final boolean[] zArr2 = {false};
        dialogInterfaceC8327M23911.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۙ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = ActivityC6167.f21005;
                boolean[] zArr3 = zArr2;
                boolean z = zArr3[0];
                zArr3[0] = !z;
                DialogInterfaceC8327 dialogInterfaceC8328 = dialogInterfaceC8327M23911;
                C24067 c24069 = c24068;
                C24067 c240610 = c24067;
                if (z) {
                    dialogInterfaceC8328.m22430(c240610.m53623() + " > " + c24069.m53623());
                    return;
                }
                dialogInterfaceC8328.m22430(c24069.m53623() + " > " + c240610.m53623());
            }
        });
        dialogInterfaceC8327M23911.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۙ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = ActivityC6167.f21005;
                dialogInterfaceC8327M23911.dismiss();
                new C23321(this.f80286, c12132Arr, zArr2);
            }
        });
    }
}
