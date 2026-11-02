.class public final Ll/᩺᩷۬;
.super Ll/ۡܶۙ;
.source "X8B6"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۗ:Landroid/os/Bundle;

.field public ۛ:Ljava/lang/String;

.field public final ۢ:Ljava/util/HashSet;

.field public ۧ:Z

.field public ۫:Z

.field public ܳ:Z

.field public ܽ:Ll/᩸᩷۬;

.field public ܿ:Z

.field public ᩻:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ll/ۡܶۙ;-><init>()V

    .line 114
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩺᩷۬;->ۢ:Ljava/util/HashSet;

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺᩷۬;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 119
    iput-boolean v0, p0, Ll/᩺᩷۬;->۫:Z

    return-void
.end method
