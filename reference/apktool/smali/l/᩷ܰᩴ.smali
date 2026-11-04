.class public final Ll/᩷ܰᩴ;
.super Ljava/lang/Object;
.source "313O"


# instance fields
.field public ۙ:Ll/ܽۘᩴ;

.field public final ۤ:I

.field public final ܳ:I

.field public ᩴ:Ljava/lang/String;

.field public ᩷:Ll/֨᩺ᩴ;

.field public ᩸:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageManager;Ll/ܽۘᩴ;II)V
    .locals 0

    .line 748
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 749
    iput-object p2, p0, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    .line 750
    invoke-virtual {p2, p1}, Ll/ܽۘᩴ;->᩷(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    .line 751
    iput p3, p0, Ll/᩷ܰᩴ;->ۤ:I

    .line 752
    iput p4, p0, Ll/᩷ܰᩴ;->ܳ:I

    return-void
.end method

.method public constructor <init>(Ll/֨᩺ᩴ;)V
    .locals 1

    .line 740
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 741
    iput-object p1, p0, Ll/᩷ܰᩴ;->᩷:Ll/֨᩺ᩴ;

    .line 742
    invoke-virtual {p1}, Ll/֨᩺ᩴ;->ۙ()Ll/᩵ܰܳ;

    move-result-object v0

    .line 249
    iget-object v0, v0, Ll/᩵ܰܳ;->᩸:Ll/ۨ֡֫;

    .line 742
    invoke-virtual {v0}, Ll/ۨ֡֫;->᩷()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ܰᩴ;->᩸:Landroid/graphics/drawable/Drawable;

    .line 743
    invoke-virtual {p1}, Ll/֨᩺ᩴ;->᩷()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 744
    iput p1, p0, Ll/᩷ܰᩴ;->ۤ:I

    .line 745
    iput p1, p0, Ll/᩷ܰᩴ;->ܳ:I

    return-void
.end method
