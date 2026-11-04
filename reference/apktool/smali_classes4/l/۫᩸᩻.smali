.class public final Ll/۫᩸᩻;
.super Ljava/lang/Object;
.source "N6PD"


# instance fields
.field public final ۙ:Z

.field public final ۤ:I

.field public final ᩷:Z


# direct methods
.method public constructor <init>(IZZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Ll/۫᩸᩻;->᩷:Z

    .line 17
    iput-boolean p2, p0, Ll/۫᩸᩻;->ۙ:Z

    .line 18
    iput p1, p0, Ll/۫᩸᩻;->ۤ:I

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 30
    iget v0, p0, Ll/۫᩸᩻;->ۤ:I

    return v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Ll/۫᩸᩻;->᩷:Z

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Ll/۫᩸᩻;->ۙ:Z

    return v0
.end method
