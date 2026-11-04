.class public final Ll/ۛ᩺ᩴ;
.super Ll/ۖ֨ܺ;
.source "LAQJ"


# instance fields
.field public final ۙ:Ll/ܽ֡֫;

.field public final ۤ:Ljava/lang/String;

.field public final ܳ:Ljava/util/List;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ll/᩷ۨᩴ;

.field public final ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ܽ֡֫;Ll/᩷ۨᩴ;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 1508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    iput-object p2, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    iput-boolean p3, p0, Ll/ۛ᩺ᩴ;->᩸:Z

    iput-object p4, p0, Ll/ۛ᩺ᩴ;->ᩴ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۛ᩺ᩴ;->ܳ:Ljava/util/List;

    iput-object p6, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۛ᩺ᩴ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩴ;->ܳ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩴ;->ᩴ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۛ᩺ᩴ;)Ll/᩷ۨᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    return-object p0
.end method

.method public static bridge synthetic ᩸(Ll/ۛ᩺ᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩺ᩴ;->᩸:Z

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1508
    instance-of v0, p1, Ll/ۛ᩺ᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۛ᩺ᩴ;

    iget-boolean v0, p0, Ll/ۛ᩺ᩴ;->᩸:Z

    iget-boolean v1, p1, Ll/ۛ᩺ᩴ;->᩸:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    iget-object v1, p1, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    iget-object v1, p1, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ᩴ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۛ᩺ᩴ;->ᩴ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ܳ:Ljava/util/List;

    iget-object v1, p1, Ll/ۛ᩺ᩴ;->ܳ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1532
    iget-object v0, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 0
    iget-boolean v0, p0, Ll/ۛ᩺ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 1508
    iget-object v2, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    invoke-static {v2}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    invoke-static {v0}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v2, p0, Ll/ۛ᩺ᩴ;->ᩴ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩻ۢ᩹;->ۙ(IILjava/lang/String;)I

    move-result v0

    .line 1508
    iget-object v1, p0, Ll/ۛ᩺ᩴ;->ܳ:Ljava/util/List;

    invoke-static {v1}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    invoke-static {v0}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1508
    iget-boolean v0, p0, Ll/ۛ᩺ᩴ;->᩸:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    aput-object v0, v1, v4

    const/4 v0, 0x3

    iget-object v4, p0, Ll/ۛ᩺ᩴ;->ᩴ:Ljava/lang/String;

    aput-object v4, v1, v0

    const/4 v0, 0x4

    iget-object v4, p0, Ll/ۛ᩺ᩴ;->ܳ:Ljava/util/List;

    aput-object v4, v1, v0

    const/4 v0, 0x5

    iget-object v4, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    aput-object v4, v1, v0

    const-string v0, "activity;file;isApks;packageName;selectedApkNames;installerPackageName"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/ۛ᩺ᩴ;

    invoke-static {v6, v4, v5}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 1508
    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_2

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v3

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()V
    .locals 2

    .line 1514
    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    new-instance v0, Ll/᩷۠ۧ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩷۠ۧ;-><init>(I)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 2

    .line 1528
    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    const/4 v1, 0x0

    .line 531
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(IZ)V

    return-void
.end method

.method public final ۙ(Landroid/content/Intent;)V
    .locals 1

    .line 1520
    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 1524
    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۙ:Ll/ܽ֡֫;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۙ(Ll/ܶ᩺ᩴ;)V
    .locals 6

    .line 1543
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1545
    new-instance v0, Ll/ۨ᩺ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۨ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;Ll/ܶ᩺ᩴ;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 1548
    :cond_0
    iget-object v0, p0, Ll/ۛ᩺ᩴ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ܽۛᩴ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const p1, 0x7f120053

    .line 1549
    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->ۙ(I)V

    return-void

    .line 1553
    :cond_1
    :goto_0
    sget-object v0, Ll/ܽ᩺ᩴ;->ۙ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-string v1, "disable_install_by_shizuku"

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۛ᩺ᩴ;->᩷:Ll/᩷ۨᩴ;

    if-eq v0, v2, :cond_11

    const/4 v4, 0x2

    if-eq v0, v4, :cond_e

    const/4 v1, 0x3

    const/4 v4, 0x0

    iget-boolean v5, p0, Ll/ۛ᩺ᩴ;->᩸:Z

    if-eq v0, v1, :cond_9

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    goto/16 :goto_3

    .line 1580
    :cond_2
    invoke-virtual {p0}, Ll/ۛ᩺ᩴ;->ۙ()V

    .line 1581
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Try install apk by System: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz v5, :cond_5

    .line 1583
    sget-object v0, Ll/۟᩺ᩴ;->ۙ:Ll/ܽ᩻ۙ;

    const-string v0, "packageInfo.versionCode="

    .line 1358
    invoke-static {}, Ll/ۡ֨ܺ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v3, "show_apks_miui_warning"

    invoke-interface {v1, v3, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1360
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.miui.packageinstaller"

    invoke-virtual {v1, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 1361
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1362
    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v1, 0xd354

    if-ge v0, v1, :cond_3

    .line 254
    :catch_0
    invoke-static {p0}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v1, 0x7f120d44

    .line 255
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    const v1, 0x7f12008f

    .line 256
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v1, Ll/ۛۛᩴ;

    invoke-direct {v1, p0}, Ll/ۛۛᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    const v2, 0x7f1208c9

    .line 257
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120161

    .line 258
    invoke-virtual {v0, v1, p1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120258

    .line 259
    invoke-virtual {v0, v1, p1}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 260
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    .line 261
    invoke-virtual {p1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/᩺ۛᩴ;

    invoke-direct {v1, p0}, Ll/᩺ۛᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    .line 262
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    invoke-static {p1}, Ll/ۚۙܺ;->ۙ(Ll/۠ۖۧ;)V

    return-void

    .line 278
    :cond_3
    invoke-static {p0}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object p1

    invoke-static {p0}, Ll/ۛ᩺ᩴ;->᩷(Ll/ۛ᩺ᩴ;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-static {p0}, Ll/ۛ᩺ᩴ;->ܳ(Ll/ۛ᩺ᩴ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ܽ֡֫;->ۙ(Ll/᩷ۨᩴ;Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_2

    .line 282
    :cond_4
    new-instance p1, Ll/ۢۛᩴ;

    invoke-direct {p1, p0}, Ll/ۢۛᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    .line 456
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    return-void

    .line 1585
    :cond_5
    sget-object v0, Ll/۟᩺ᩴ;->ۙ:Ll/ܽ᩻ۙ;

    .line 805
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    .line 806
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 807
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v1}, Ll/֫ᩴۧ;->ۙ(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    const-string v2, "application/vnd.android.package-archive"

    if-eqz v1, :cond_6

    .line 810
    :try_start_1
    invoke-static {v3}, Ll/ܽۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Landroid/net/Uri;

    move-result-object v5

    .line 811
    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 812
    invoke-static {v0, v5}, Ll/֨ۤ۫;->ۙ(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 813
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 814
    invoke-virtual {p0, v0}, Ll/ۛ᩺ᩴ;->ۙ(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    .line 819
    :catch_1
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 821
    :cond_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge p1, v1, :cond_7

    sget-object p1, Ll/ܽۨᩴ;->ܰ:Ljava/lang/String;

    .line 88
    sget-object p1, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const-string v5, "apk_installation_prevents_deletion"

    invoke-interface {p1, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_7

    .line 821
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ۨ()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 823
    :try_start_2
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 824
    invoke-virtual {p0, v0}, Ll/ۛ᩺ᩴ;->ۙ(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_2

    .line 831
    :catch_2
    :cond_7
    :try_start_3
    invoke-static {v3}, Ll/ܽۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Landroid/net/Uri;

    move-result-object p1

    .line 832
    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 833
    invoke-static {v0, p1}, Ll/֨ۤ۫;->ۙ(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 834
    invoke-virtual {p0, v0}, Ll/ۛ᩺ᩴ;->ۙ(Landroid/content/Intent;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_2

    :catch_3
    move-exception p1

    .line 837
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_8

    .line 838
    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->ۙ(Ljava/lang/Exception;)V

    goto/16 :goto_2

    .line 843
    :cond_8
    new-instance p1, Ll/۬ۛᩴ;

    invoke-direct {p1, p0, v0}, Ll/۬ۛᩴ;-><init>(Ll/ۛ᩺ᩴ;Landroid/content/Intent;)V

    .line 876
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    goto/16 :goto_2

    .line 1569
    :cond_9
    invoke-static {}, Ll/۟᩺ᩴ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1570
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Try install apk by Shell: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    if-eqz v5, :cond_a

    .line 503
    sget-object p1, Ll/ۛۨᩴ;->ۚ:Ll/᩷ۨᩴ;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->᩹ۙ()Ll/᩷ۨᩴ;

    move-result-object p1

    .line 504
    new-instance v0, Ll/ۖۛᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۖۛᩴ;-><init>(Ll/ۛ᩺ᩴ;Ll/᩷ۨᩴ;)V

    .line 637
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void

    .line 881
    :cond_a
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 882
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_b

    const-string p1, "/data/local/tmp"

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    :cond_b
    const/4 v2, 0x0

    goto :goto_1

    :cond_c
    const/4 v2, 0x2

    .line 890
    :cond_d
    :goto_1
    new-instance p1, Ll/ۤ᩺ᩴ;

    invoke-direct {p1, p0, v2}, Ll/ۤ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;I)V

    .line 1009
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    return-void

    .line 1562
    :cond_e
    sget-object v0, Ll/۟᩺ᩴ;->ۙ:Ll/ܽ᩻ۙ;

    .line 1354
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v4, "apk_installation_dhizuku"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1453
    invoke-static {}, Ll/᩵ۙۧ;->ۤ()Ll/᩵ۙۧ;

    move-result-object v0

    .line 1454
    invoke-virtual {v0, v1}, Ll/᩵ۙۧ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 1563
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Try install apk by Dhizuku: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1047
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p1

    invoke-static {p1}, Lcom/rosan/dhizuku/api/Dhizuku;->init(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_f

    .line 1048
    sget-object p1, Ll/ܶ᩺ᩴ;->᩶:Ll/ܶ᩺ᩴ;

    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    return-void

    .line 1053
    :cond_f
    :try_start_4
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->isPermissionGranted()Z

    move-result p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    if-nez p1, :cond_10

    .line 1059
    new-instance p1, Ll/ᩴ᩺ᩴ;

    invoke-direct {p1, p0}, Ll/ᩴ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    invoke-static {p1}, Lcom/rosan/dhizuku/api/Dhizuku;->requestPermission(Lcom/rosan/dhizuku/api/DhizukuRequestPermissionListener;)V

    return-void

    .line 1077
    :cond_10
    new-instance p1, Ll/ܳ᩺ᩴ;

    invoke-direct {p1, p0}, Ll/ܳ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    .line 1098
    new-instance v0, Ll/ܺ᩺ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܺ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;Ll/᩵᩺ᩴ;)V

    .line 1247
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void

    .line 1055
    :catch_4
    sget-object p1, Ll/ܶ᩺ᩴ;->᩶:Ll/ܶ᩺ᩴ;

    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    return-void

    .line 1555
    :cond_11
    invoke-static {}, Ll/۟᩺ᩴ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1453
    invoke-static {}, Ll/᩵ۙۧ;->ۤ()Ll/᩵ۙۧ;

    move-result-object v0

    .line 1454
    invoke-virtual {v0, v1}, Ll/᩵ۙۧ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 1556
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Try install apk by Shizuku: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1014
    invoke-static {}, Ll/۟᩺ᩴ;->᩸()I

    move-result p1

    if-nez p1, :cond_12

    .line 1016
    sget-object p1, Ll/ܶ᩺ᩴ;->֡:Ll/ܶ᩺ᩴ;

    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    return-void

    :cond_12
    if-ne p1, v2, :cond_14

    .line 1375
    new-instance p1, Ll/ۘ᩺ᩴ;

    invoke-direct {p1, p0}, Ll/ۘ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    .line 1376
    invoke-virtual {p1}, Ll/ۘ᩺ᩴ;->ۙ()Z

    move-result p1

    if-nez p1, :cond_13

    .line 1377
    sget-object p1, Ll/ܶ᩺ᩴ;->֡:Ll/ܶ᩺ᩴ;

    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    :cond_13
    :goto_2
    return-void

    .line 1022
    :cond_14
    new-instance p1, Ll/᩸᩺ᩴ;

    invoke-direct {p1, p0}, Ll/᩸᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;)V

    .line 1098
    new-instance v0, Ll/ܺ᩺ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܺ᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;Ll/᩵᩺ᩴ;)V

    .line 1247
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void

    .line 1590
    :cond_15
    :goto_3
    invoke-virtual {p1}, Ll/ܶ᩺ᩴ;->ۙ()Ll/ܶ᩺ᩴ;

    move-result-object p1

    goto/16 :goto_0
.end method

.method public final ᩷(Ll/ܶ᩺ᩴ;)V
    .locals 0

    .line 1595
    invoke-virtual {p1}, Ll/ܶ᩺ᩴ;->ۙ()Ll/ܶ᩺ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ܶ᩺ᩴ;)V

    return-void
.end method
