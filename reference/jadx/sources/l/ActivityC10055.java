package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10055 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34353 = 0;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f34354 = C11904.f39938.m46690("tran3");

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public String f34355;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f34356;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C6606 f34357;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C16465 f34358;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public View f34359;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f34360;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34361 = new ArrayList();

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f34362 = new HashMap();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ArscTranslationMain";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31023();
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC8814(2, this));
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C21343 c21343 = new C21343(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c21343);
        C6606 c6606 = (C6606) m31016(android.R.id.list);
        this.f34357 = c6606;
        c6606.setFastScrollEnabled(true);
        this.f34357.setOnItemClickListener(this);
        this.f34359 = m31016(R.id.MT_Protector);
        C16465 c16465 = (C16465) m31016(R.id.MT_Protector);
        this.f34358 = c16465;
        c16465.setChecked(ApplicationC0716.f2992.getBoolean("arsc_translation_keep", true));
        this.f34358.setOnCheckedChangeListener(new C22049());
        if (C5553.m15320((AbstractActivityC12483) this)) {
            return;
        }
        this.f34360 = C5553.m15309(getIntent());
        if (bundle != null && bundle.getBoolean("stateOK")) {
            try {
                this.f34355 = bundle.getString("digest");
                this.f34356 = bundle.getBoolean("changed");
                ArrayList<String> stringArrayList = bundle.getStringArrayList("filePaths");
                C13638.requireNonNull(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = this.f34361;
                    if (zHasNext) {
                        C7232 c7232 = new C7232(C5553.m15313(it.next(), new String[0]));
                        String strM19265 = c7232.m19265();
                        arrayList.add(strM19265);
                        this.f34362.put(strM19265, c7232);
                    } else {
                        Collections.sort(arrayList);
                        this.f34357.setAdapter((ListAdapter) new C7938(this));
                        return;
                    }
                }
            } catch (Exception e) {
                m31003((Throwable) e, true);
            }
        } else {
            new C14994(this).m10243();
        }
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f34355;
        if (str == null) {
            return;
        }
        bundle.putString("digest", str);
        bundle.putBoolean("changed", this.f34356);
        HashMap map = this.f34362;
        ArrayList<String> arrayList = new ArrayList<>(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((C7232) it.next()).m19267().mo33986());
        }
        bundle.putStringArrayList("filePaths", arrayList);
        bundle.putBoolean("stateOK", true);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f34355 == null) {
            return;
        }
        Iterator it = this.f34362.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                ((C7232) it.next()).m19266();
            } catch (IOException e) {
                m31002(e, (DialogInterface.OnDismissListener) null);
                z = true;
            }
        }
        if (z) {
            this.f34356 = false;
        } else {
            this.f34356 = this.f34356 || !this.f34355.equals(m25451());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m25451() {
        MessageDigest messageDigestM49416 = C22253.m49416();
        Iterator it = this.f34362.values().iterator();
        while (it.hasNext()) {
            ((C7232) it.next()).m19262(messageDigestM49416);
        }
        return C22253.m49424(messageDigestM49416.digest());
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
            new C17815(this, false).m10243();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m25458();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f34359.getVisibility() == 0) {
                this.f34359.setVisibility(8);
                return true;
            }
            this.f34359.setVisibility(0);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId != R.id.MT_Protector) {
                return false;
            }
            if (C1709.m5692()) {
                startActivity(new Intent(this, (Class<?>) ActivityC0061.class));
                return true;
            }
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
        ArrayList arrayList = this.f34361;
        if (arrayList.size() < 2) {
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
        C15829.m37611(R.string.MT_Protector);
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        final boolean[] zArr = new boolean[strArr.length];
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21268(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.֨ۙۖ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                int i2 = ActivityC10055.f34353;
                zArr[i] = z;
            }
        });
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.۬ۙۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10055.m25456(this.f42824, zArr, strArr, dialogInterfaceC19356M10334);
            }
        });
        return true;
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m25458();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public void m25458() {
        if (this.f34356) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚۙۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC10055.f34353;
                    new C17815(this.f17817, true).m10243();
                }
            });
            c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19397(1, this));
            c8067.m21269();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        f34354.mo24647();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent(this, (Class<?>) ActivityC2965.class);
        C7232 c7232 = (C7232) this.f34362.get(this.f34361.get(i));
        C13638.requireNonNull(c7232);
        intent.setData(c7232.m19267().m46732());
        startActivity(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25456(final ActivityC10055 activityC10055, boolean[] zArr, String[] strArr, DialogInterfaceC19356 dialogInterfaceC19356) {
        HashMap map = activityC10055.f34362;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            if (zArr[i3]) {
                if (i == -1) {
                    i = i3;
                } else {
                    if (i2 != -1) {
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    i2 = i3;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        final C7232<C20638> c7232 = (C7232) map.get(strArr[i]);
        C13638.requireNonNull(c7232);
        final C7232<C20638> c7233 = (C7232) map.get(strArr[i2]);
        C13638.requireNonNull(c7233);
        HashMap map2 = new HashMap();
        for (C20638 c20638 : c7232) {
            C13583 c13583 = new C13583(c20638.f67202, c20638.f67203);
            String str = c20638.f67201;
            if (str == null) {
                str = c20638.f67205;
            }
            map2.put(c13583, new C8644(str));
        }
        for (C20638 c20639 : c7233) {
            C8644 c8644 = (C8644) map2.get(new C13583(c20639.f67202, c20639.f67203));
            if (c8644 != null) {
                String str2 = c20639.f67201;
                if (str2 == null) {
                    str2 = c20639.f67205;
                }
                c8644.f29820 = str2;
            }
        }
        final C8644[] c8644Arr = (C8644[]) C9030.stream(map2.values()).filter(new C3703()).toArray(new C6526());
        if (c8644Arr.length == 0) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        dialogInterfaceC19356.dismiss();
        C8067 c8067BuildDialog = activityC10055.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(c7232.m19265() + " > " + c7233.m19265());
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        final DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final boolean[] zArr2 = {false};
        final int i4 = 1;
        dialogInterfaceC19356M52499.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩶ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                Serializable serializable = c7232;
                Object obj = c7233;
                Object obj2 = dialogInterfaceC19356M52499;
                Object obj3 = zArr2;
                switch (i5) {
                    case 0:
                        C14745 c14745 = (C14745) obj3;
                        C16148 c16148 = (C16148) serializable;
                        AbstractC16214 abstractC16214 = C0690.f2885;
                        c14745.f48224 = abstractC16214.mo38327();
                        c14745.f48225 = EnumC23917.m52739(abstractC16214);
                        ((ImageView) obj2).setImageBitmap(((InterfaceC21926) obj).mo40846(c14745));
                        if (c16148.mo38231()) {
                            c16148.m38232();
                            ((DialogInterfaceC19356) c16148.mo7338()).m44372(false);
                        }
                        break;
                    default:
                        boolean[] zArr3 = (boolean[]) obj3;
                        DialogInterfaceC19356 dialogInterfaceC19357 = (DialogInterfaceC19356) obj2;
                        C7232 c7234 = (C7232) obj;
                        C7232 c7235 = (C7232) serializable;
                        int i6 = ActivityC10055.f34353;
                        boolean z = zArr3[0];
                        zArr3[0] = !z;
                        if (!z) {
                            dialogInterfaceC19357.m44371(c7234.m19265() + " > " + c7235.m19265());
                        } else {
                            dialogInterfaceC19357.m44371(c7235.m19265() + " > " + c7234.m19265());
                        }
                        break;
                }
            }
        });
        dialogInterfaceC19356M52499.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۙۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = ActivityC10055.f34353;
                dialogInterfaceC19356M52499.dismiss();
                new C18521(this.f74104, c8644Arr, zArr2);
            }
        });
    }
}
