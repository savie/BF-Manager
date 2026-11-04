.class public final Ll/֡ۤۧ;
.super Ljava/lang/Object;
.source "A92H"


# instance fields
.field public final ۙ:Ll/ܽ֡֫;

.field public ۤ:Landroid/os/Bundle;

.field public ۫:Z

.field public ܳ:Ljava/lang/String;

.field public ᩴ:[Ljava/lang/String;

.field public ᩷:Ll/ۡۤۧ;

.field public ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;)V
    .locals 1

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/֡ۤۧ;->ۤ:Landroid/os/Bundle;

    .line 266
    iput-object p1, p0, Ll/֡ۤۧ;->ۙ:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 295
    iput-boolean v0, p0, Ll/֡ۤۧ;->۫:Z

    return-void
.end method

.method public final ۙ(I)V
    .locals 2

    const-string v0, "nsId"

    .line 310
    iget-object v1, p0, Ll/֡ۤۧ;->ۤ:Landroid/os/Bundle;

    invoke-virtual {v1, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 270
    iput-object p1, p0, Ll/֡ۤۧ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Ll/ۡۤۧ;)V
    .locals 0

    .line 275
    iput-object p1, p0, Ll/֡ۤۧ;->᩷:Ll/ۡۤۧ;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 2

    const-string v0, "nsIsDir"

    .line 305
    iget-object v1, p0, Ll/֡ۤۧ;->ۤ:Landroid/os/Bundle;

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۙ([Ljava/lang/String;)V
    .locals 0

    .line 280
    iput-object p1, p0, Ll/֡ۤۧ;->ᩴ:[Ljava/lang/String;

    return-void
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 0

    .line 290
    iput-object p1, p0, Ll/֡ۤۧ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ᩷()V
    .locals 8

    .line 316
    new-instance v0, Ll/۟ۤۧ;

    iget-object v2, p0, Ll/֡ۤۧ;->᩸:Ljava/lang/String;

    iget-object v3, p0, Ll/֡ۤۧ;->᩷:Ll/ۡۤۧ;

    iget-object v4, p0, Ll/֡ۤۧ;->ᩴ:[Ljava/lang/String;

    iget-object v5, p0, Ll/֡ۤۧ;->ܳ:Ljava/lang/String;

    iget-object v6, p0, Ll/֡ۤۧ;->ۤ:Landroid/os/Bundle;

    iget-boolean v7, p0, Ll/֡ۤۧ;->۫:Z

    iget-object v1, p0, Ll/֡ۤۧ;->ۙ:Ll/ܽ֡֫;

    invoke-direct/range {v0 .. v7}, Ll/۟ۤۧ;-><init>(Ll/ܽ֡֫;Ljava/lang/String;Ll/ۡۤۧ;[Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 0

    .line 285
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۤۧ;->ᩴ:[Ljava/lang/String;

    return-void
.end method
